package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SummaryRange {
    public List<String> summaryRanges(int[] nums) {
        List<String>list= new ArrayList<>();
        String s= "";
        int count=0;
        if(nums.length==1){
            s= String.valueOf(nums[0]);
            list.add(s);
            return list;
        }

        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]+1!=nums[i+1]){
                if(nums[count]==nums[i]){
                    s= String.valueOf(nums[i]);
                    list.add(s);

                }else {
                    s= nums[count] +"->"+ nums[i];
                    list.add(s);
                }
                count=i+1;

            }

            if((i+1)==nums.length-1){

                if(nums[count]==nums[i+1]){
                    s= String.valueOf(nums[i+1]);
                    list.add(s);

                }else {
                    s= nums[count] +"->"+ nums[i+1];
                    list.add(s);
                }



            }
        }
        return list;

    }
}
