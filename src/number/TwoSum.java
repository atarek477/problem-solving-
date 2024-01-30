package number;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] n = new int[2];
        int j = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {

            if (i == j) {
                i = 0;
                j = j - 1;
            }


            if (nums[i] + nums[j] == target) {
                n[0] = i;
                n[1] = j;
                return n;

            }
            if (j == 0)
                return n;


        }
        return n;
    }

}
