package bits;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.BitSet;

public class NumberComplement {
    public static int findComplement(int num) {


        StringBuilder stringBuilder = new StringBuilder();
        while (num > 0) {

            stringBuilder.insert(0,((num & 1) ^ 1));
            num = num >> 1;

        }

        int i = Integer.parseInt(stringBuilder.toString(),2);

        return i;
    }
}
