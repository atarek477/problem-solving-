package arrays;

public class IntersectionBetweenTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] nums3= new int[1000];
        int count=0;
        for (int i = 0; i < nums1.length; i++) {
            nums3[nums1[i]]++;
        }
        for (int i = 0; i <nums2.length ; i++) {
            if(nums3[nums2[i]]!=0&&nums3[nums2[i]]!=10){
                count++;
                nums3[nums2[i]]=10;
            }

        }
        int[] nums4= new int[count];
        int u=0;
        for (int i = 0; i <nums2.length ; i++) {
            if(nums3[nums2[i]]!=0){
                nums4[u]=nums2[i];
                u++;
                nums3[nums2[i]]=0;
            }

        }
        return nums4;
    }

}
