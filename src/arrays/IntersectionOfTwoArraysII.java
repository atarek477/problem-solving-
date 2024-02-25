package arrays;

import java.sql.Array;
import java.util.*;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left=0;
        int right=0;
        while (left<nums1.length&&right<nums2.length){
            if(nums1[left]==nums2[right]){
                list.add(nums1[left]);
                left++;
                right++;

            } else if (nums1[left]>nums2[right]) {
                right++;

            }else {

                left++;
            }


        }




        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
