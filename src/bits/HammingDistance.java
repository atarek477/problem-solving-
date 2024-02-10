package bits;

public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int z = x ^ y;
        System.out.println(z);
        int count=0;
        for (int i = 0; i <32 ; i++) {
            if((z&1)==1){count++;}
            z=z>>1;



        }
        return count;
    }


}
