package hashtable_or_mab;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {

    public List<Integer> findDuplicates(int[] nums) {


        List<Integer>list= new ArrayList<>();

        for (int i = 0; i < nums.length ; i++) {

            int x= Math.abs(nums[i]);
            if(nums[x-1]<0){
                list.add(x);
                continue;
            }

            nums[x-1]= nums[x - 1]*-1;



        }


        return list;
    }



}
