package problems;

import java.util.Comparator;
import java.util.PriorityQueue;

public class JumpGame {


    public static boolean canJump(int[] nums) {

        PriorityQueue<Integer> priorityQueue= new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add(0);

        if(nums[0]==0&&nums.length!=1)
            return false;

        for (int i = 0; i <nums.length-1 ; i++) {

            if(priorityQueue.peek()<i||(i+nums[i]==i&&priorityQueue.peek()<i+1))
                break;

            priorityQueue.add(i+nums[i]);
        }
        return (priorityQueue.poll()>=nums.length-1);

    }

}
