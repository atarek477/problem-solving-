package bits;

public class CountingBits {
    public int[] countBits(int n) {
        int x[]= new int[n+1];
        x[0]=0;
        if(n==0){return x;}
        for (int i = 1; i <=n ; i++) {
            int count = 0;
            int j=i;
            while (j > 0) {
                count += j & 1;
                j >>= 1;
            }
            x[i]=count;
        }

        return x;
    }




}
