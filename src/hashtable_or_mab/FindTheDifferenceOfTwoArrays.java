package hashtable_or_mab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {



    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {


        Set<Integer>map1= new HashSet<>();
        Set<Integer>map2= new HashSet<>();
        List<List<Integer>> lists= new ArrayList<>();
        for (int i = 0; i <Math.max(nums1.length,nums2.length) ; i++) {

            if (i<nums1.length){
                map1.add(nums1[i]);
            }
            if (i<nums2.length){
                map2.add(nums2[i]);
            }
        }


        for (int i = 0; i <Math.max(nums1.length,nums2.length) ; i++) {

            if (i<nums2.length){
                map1.remove(nums2[i]);
            }
            if (i<nums1.length){
                map2.remove(nums1[i]);
            }

        }
        lists.add(new ArrayList<>(map2));
        lists.add(new ArrayList<>(map1));



        return  lists;

    }
}
