package twopointer;

public class MinimumCommonValue {

    public int getCommon(int[] nums1, int[] nums2) {
        int point1=0;
        int point2=0;

        while(point1<nums1.length&&point2<nums2.length){

            if(nums1[point1]>nums2[point2])
              point2++;
            else if (nums1[point1]<nums2[point2]) {
                point1++;
            }else {return nums1[point1];}


        }
return 0;
    }

}
