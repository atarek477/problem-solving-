package number;

import java.math.BigInteger;

public class ReverseInt {
    public static int reverse(int x) {





        if(x/10==0){
            return x;
        }

        BigInteger bigInteger= new BigInteger("2147483647");
        BigInteger bigInteger1= new BigInteger("-2147483648");

        StringBuilder s= new StringBuilder(String.valueOf(x));
        int i=0;
        for (int j = s.length()-1; j >=0 ; j--) {
            if(s.charAt(j)!='0')
                break;
            s.deleteCharAt(j);

        }

        s.reverse();

        if(s.charAt(s.length()-1)=='-'){
            s.deleteCharAt(s.length()-1);
            s.insert(0,'-');


        }
        if(bigInteger.compareTo(new BigInteger(String.valueOf(s)))==-1||
                bigInteger1.compareTo(new BigInteger(String.valueOf(s)))==1){

            return 0;
        }
        return Integer.parseInt(String.valueOf(s));
    }
}
