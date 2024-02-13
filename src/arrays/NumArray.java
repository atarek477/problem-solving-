package arrays;
class NumArray {
    private int[] nums;

    public NumArray(int[] nums) {
        this.nums= nums;
    }

    public int sumRange(int left, int right) {
        int count =0 ;
        for(int i= left;i<=right;i++ ){
            count = count +nums[i];

        }
        return count ;
    }
}
