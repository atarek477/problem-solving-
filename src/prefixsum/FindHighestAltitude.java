package prefixsum;

public class FindHighestAltitude {
    public int largestAltitude(int[] gain) {

        int[] result = new int[gain.length+1];
        int max=0;
        for (int i = 1; i <result.length ; i++) {

            result[i]=result[i-1]+gain[i-1];
            if(max<result[i]){max=result[i];}


        }


        return max;
    }



}
