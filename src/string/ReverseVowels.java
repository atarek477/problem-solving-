package string;

import java.util.Stack;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        Stack<Character> stack= new Stack<Character>();
        StringBuilder n= new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if ("AEIOUaeiou".indexOf(s.charAt(i))!=-1){
                stack.push(s.charAt(i));
            }
        }
        for (int i = 0; i <s.length() ; i++) {

            if ("AEIOUaeiou".indexOf(s.charAt(i))!=-1){
                n.append(stack.pop());
            }else{
                n.append(s.charAt(i));}
        }

    return n.toString();
    }
}
