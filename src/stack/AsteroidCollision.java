package stack;

import java.util.Stack;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack= new Stack<>();
        stack.push(asteroids[0]);
        for (int i = 1; i <asteroids.length ; i++) {
            if(stack.isEmpty()){
                stack.push(asteroids[i]);
                continue;
            }
            if (stack.peek()>0&&asteroids[i]<0){
                if(stack.peek()>Math.abs(asteroids[i])){
                    continue;
                } else if (stack.peek()<Math.abs(asteroids[i])) {
                    stack.pop();
                    i=i-1;

                }else {
                    stack.pop();
                }
            } else {
                stack.push(asteroids[i]);
            }
        }
        int [] result =new int[stack.size()];
        int count=stack.size()-1;
        while (!stack.isEmpty()){
            result[count]=stack.pop();
            count--;
        }
        return result;
    }

}
