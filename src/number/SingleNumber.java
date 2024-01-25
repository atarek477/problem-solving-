package number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SingleNumber {
    public static int singleNumber1(int[] nums) {

        HashMap<Integer,Integer> hashMap= new HashMap<>();
      //  hashMap.put()
if(nums.length==1){
    return nums[0];
}
        int size=Arrays.stream(nums)
                .max()
                .orElse(0)+1;
        int[] num= new int[size];
        for (int i = 0; i < num.length; i++) {
            num[nums[i]]=num[nums[i]]+1;
        }

        for (int i = 0; i < num.length; i++) {
            if(num[i]==1){
                return i;}
        }


        return 0;
    }
    public static int singleNumber(int[] nums) {
        boolean isElementPresent;
        List<Integer> list= new ArrayList<>() ;
        if(nums.length==1){
            return nums[0];
        }

        for (int n : nums) {

            isElementPresent = list.stream().anyMatch(element -> element == n);
            if (isElementPresent) {
                list.removeIf(element -> element == n);
                ;
            }
            else{
                list.add(n);
            }
        }




        return list.stream().min(Integer::compareTo).orElse(0);
    }


}


