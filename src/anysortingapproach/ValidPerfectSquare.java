package anysortingapproach;

public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        long number=num/2;
        long right = num;
        long left = 0;
        while (left<=right){
           if (number*number==num){
               return true;
           }
           else if (number*number>num) {
               right =number-1;
               number=(left+right)/2;
           }
           else {
               left=number+1;
               number=(left+right)/2;

           }

           }

return false;
       }


    }

