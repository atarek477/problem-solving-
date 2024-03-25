package stack;

import java.util.Objects;
import java.util.Stack;

public class DecodeString {

    public static String decodeString(String s) {
        String result="";
        String temp="";
        String num="";
        Stack<String> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==']'){
                while (!Objects.equals(stack.peek(), "[")){

                    temp=stack.pop()+temp;

                }
                stack.pop();
                while (!stack.isEmpty()&&(stack.peek().charAt(0)<58&&stack.peek().charAt(0)>47)){
                    num=stack.pop()+num;
                }

                int count = Integer.parseInt(String.valueOf(num));
                System.out.println(count);
                temp= temp.repeat(count);
                stack.push(temp);
                temp="";
                num="";
                continue;


            }
            stack.push(String.valueOf(s.charAt(i)));

        }
        while (!stack.isEmpty())
            result=stack.pop()+result;


        return result;
    }
}
