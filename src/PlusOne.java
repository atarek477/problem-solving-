import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;


        for (int i = n - 1; i >= 0; i--) {

            digits[i]++;


            if (digits[i] < 10) {
                return digits;
            }


            digits[i] = 0;
        }


        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

}
