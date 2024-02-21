package arrays;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] map = new int[nums.length+1];
        int[] result= new int[2];
        for (int i = 0; i <nums.length ; i++) {
            map[nums[i]]++;
        }
        for (int i = 1; i <map.length ; i++) {
            if(map[i]>1){
                result[0]=i;
            }
            else if(map[i]==0){
                result[1]=i;
            }

        }



        return result;
    }


}
