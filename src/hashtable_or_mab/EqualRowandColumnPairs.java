package hashtable_or_mab;

import java.util.Arrays;
import java.util.HashMap;

public class EqualRowandColumnPairs {

    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String, Integer> row = new HashMap<>();
        StringBuilder eachCol = new StringBuilder();
        StringBuilder eachRow = new StringBuilder();
        int count = 0;


        for (int[] ints : grid) {
            for (int j = 0; j < n; j++) {
                eachRow.append(ints[j]).append(",");

            }
            row.put(eachRow.toString(), row.getOrDefault(eachRow.toString(), 0) + 1);
            eachRow = new StringBuilder();
        }
        for (int i = 0; i < n; i++) {
            for (int[] ints : grid) {
                eachCol.append(ints[i]).append(",");

            }
            count = count + row.getOrDefault(eachCol.toString(), 0);

            eachCol = new StringBuilder();
        }
        return count;
    }
}
