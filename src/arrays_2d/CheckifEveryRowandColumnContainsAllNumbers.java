package arrays_2d;

import java.util.HashSet;
import java.util.Set;

public class CheckifEveryRowandColumnContainsAllNumbers {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            Set<Integer> setcol = new HashSet<>();
            Set<Integer> setrow = new HashSet<>();

            for (int j = 0; j < n; j++) {

                if (setcol.contains(matrix[i][j]) && matrix[i][j] != '.') {
                    return false;
                }
                if (setrow.contains(matrix[j][i]) && matrix[j][i] != '.') {
                    return false;
                }
                setrow.add(matrix[j][i]);
                setcol.add(matrix[i][j]);
            }
        }

        return true;
    }
}