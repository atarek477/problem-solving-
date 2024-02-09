package number;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PowerofTwo {
            public static boolean isPowerOfTwo(int n){

                for(int i=0;i<32;i++)
                {
                    if(Math.pow(2,i)==n){
                        return true;
                    }
                }
                return false;
            }
        }



