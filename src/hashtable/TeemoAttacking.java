package hashtable;

import java.util.HashSet;

public class TeemoAttacking {

//    public static int findPoisonedDuration(int[] timeSeries, int duration) {
//        int count =timeSeries[0]+(duration-1);
//        System.out.println(count);
//        for (int i = 1; i <timeSeries.length ; i++) {
//
//            if(count>=timeSeries[i]) {
//                count = count + ((timeSeries[i] + (duration - 1)) - count);
//            }else{
//                count= count+(duration);
//                System.out.println(count);
//            }
//
//        }
//        return count;
//
//    }
public static int findPoisonedDuration(int[] timeSeries, int duration) {
    int count =duration;
    System.out.println(count);
    for (int i = 0; i <timeSeries.length-1 ; i++) {

        if((timeSeries[i]+(duration-1))>=timeSeries[i+1]) {
            count = count + ((timeSeries[i+1] + (duration - 1)) -(timeSeries[i]+(duration-1)));
        }else{
            count= count+(duration);
        }

    }
    return count;

}



}
