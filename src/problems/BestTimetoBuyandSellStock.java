package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BestTimetoBuyandSellStock {


    public static int maxProfit ( int[] prices){
        Stack<Integer> stack = new Stack<>();
        List<Integer>list= new ArrayList<>();
        int max = 0;
        stack.push(prices[0]);
        for (int i = 1; i < prices.length; i++) {
            if ((prices[i]-stack.peek()) < 0 && (i != prices.length - 1)) {
                stack.pop();
                stack.push(prices[i]);
                max=0;} else {
                if (max < (prices[i] - stack.peek())) {
                    max = (prices[i] - stack.peek());
                    list.add(max);}
            }

        }

        return list.stream()
                .max(Integer::compareTo)
                .orElse(0);
    }
    }

