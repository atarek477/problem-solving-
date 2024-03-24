package stack;

import java.util.Stack;

public class RemovingStarsFromString {

    public String removeStars(String s) {
        Stack<Character>stack=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {

            if(s.charAt(i)!='*')
            { stack.push(s.charAt(i));
            continue;}
            stack.pop();
        }
        StringBuilder stringBuilder= new StringBuilder();
        while (!stack.isEmpty())
        {
            stringBuilder.insert(0,stack.pop());
        }
        return stringBuilder.toString();
    }
}
