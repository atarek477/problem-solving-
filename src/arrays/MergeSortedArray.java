package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
            return;
        int i=m;
        int l=0;
        int j=n+m;
        while(i<j){
            nums1[i]=nums2[l];
            i++;
            l++;

        }
        Arrays.sort(nums1);


    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
            return;
        else if (m==0) {
            nums1=nums2;
            return;
        }
        int p1  = m-1;
        int p2  = n-1;
        int len = nums1.length-1;
        while(p2!=0||p1!=0){
           if(nums2[p2]>nums1[p1]){
               nums1[len]=nums2[p2];
               p2--;
               len--;
           }else {
               nums1[len]=nums1[p1];
               p1--;
               len--;

           }
        }
        Arrays.stream(nums1).forEach(System.out::println);
       // Arrays.sort(nums1);


    }



}
