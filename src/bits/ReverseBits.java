package bits;

public class ReverseBits {

    int x= 0b00000010100101000001111010011100;

    public static int reverseBits(int n) {
        int ans =0;
        while (n>0){

           ans= ans|(n&1); //most significant bit or with our register ans
           n=n>>1;
            ans= ans<<1;

        }

       return ans;
    }
}
