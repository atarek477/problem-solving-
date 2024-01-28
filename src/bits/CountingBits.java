package bits;

public class CountingBits {
    public int[] countBits1(int n) {
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

    public int[] countBits(int n) {

        int [] ones = new int[n+1];
        for (int i = 0; i <=n ; i++) {
            ones[i]= ones[i/2]+i%2;

        }

return ones;
    }





}
