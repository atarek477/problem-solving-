package problems;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer>stack= new Stack<>();
        int first =0;
        int second =0;
        int result=0;
        for (int i = 0; i <operations.length ; i++) {
            if (operations[i].equals("+")) {
                second= stack.pop();
                first= stack.peek();
                stack.push(second);
                stack.push(first+second);
                result= result+first+second;


            }else if (operations[i].equals("D")){
                stack.push(stack.peek()*2);
                result= result+(stack.peek());

            }else if (operations[i].equals("C")) {

                result= result-stack.pop();
            }else{
                stack.push(Integer.parseInt(operations[i]));
                result= result+Integer.parseInt(operations[i]);

            }


        }

        return result;
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }




}
