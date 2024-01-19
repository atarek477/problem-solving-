package problems;

public class ReverseBits {

    int x= 0b00000010100101000001111010011100;

    public static int reverseBits(int n) {
        int ans =0;
        for (int i = 0; i < 32; i++) {
           ans= ans<<1;
           ans= ans|(n&1); //most significant bit or with our register ans
           n=n>>1;

        }

       return ans;
    }
}
