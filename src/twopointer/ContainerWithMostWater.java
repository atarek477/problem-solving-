package twopointer;

import java.util.ArrayList;
import java.util.List;

public class ContainerWithMostWater {


    public int maxArea(int[] height) {
        List<Integer>list=new ArrayList<>();
        int left  =0;
        int right =height.length-1;
        int max=Math.min(height[left],height[right])*(right-left);
        int result=0;



       while (left<right){

           if (height[left]>height[right])
           {
               right--;


           } else if (height[left]<height[right]) {
               left++;

           }else {
               left++;
               right--;

           }
           result=Math.min(height[left],height[right])*(right-left);
           if (result>max){
               max=result;
           }

       }
       return max;
    }
}
