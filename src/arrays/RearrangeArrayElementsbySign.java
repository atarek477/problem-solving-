package arrays;

public class RearrangeArrayElementsbySign {

    public int[] rearrangeArray(int[] nums) {
        int count=0,i=0,j=1;
        int[] result= new int[nums.length];
        while(i<nums.length||j<nums.length||count<nums.length){
            if(nums[count]>0){
                result[i]=nums[count];
                i=i+2;
                count++;
                continue;

            }
            if(nums[count]<0){
                result[j]=nums[count];
                j=j+2;
                count++;

            }




        }




     return   result;
    }

}
