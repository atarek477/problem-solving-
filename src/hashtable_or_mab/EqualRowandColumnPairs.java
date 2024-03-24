package hashtable_or_mab;

import java.util.Arrays;
import java.util.HashMap;

public class EqualRowandColumnPairs {

    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String, Integer> row = new HashMap<>();
        String eachCol = "";
        String eachRow = "";
        int count = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                eachRow = eachRow + grid[i][j] + ",";

            }
            row.put(eachRow, row.getOrDefault(eachRow, 0) + 1);
            eachRow = "";
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                eachCol = eachCol + grid[j][i] + ",";

            }
            count = count + row.getOrDefault(eachCol, 0);

            eachCol = "";
        }
        return count;
    }
}
