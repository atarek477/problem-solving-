package number;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int curr = nums[0] + nums[1] + nums[nums.length - 1];
        int curr1 = Math.abs(curr - target);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            int sum = 0;

            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    return sum;

                } else if (sum < target) {
                    if (Math.abs(target - sum) < curr1) {
                        curr1 = Math.abs(target - sum);
                        curr = sum;
                    }

                    left++;

                } else {
                    if (Math.abs(target - sum) < curr1) {
                        curr1 = Math.abs(target - sum);
                        curr = sum;
                    }
                    right--;
                }
            }
        }

        return curr;

    }


}
