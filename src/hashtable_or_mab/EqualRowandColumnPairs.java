package hashtable_or_mab;

import java.util.Arrays;
import java.util.HashMap;

public class EqualRowandColumnPairs {

    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String,Integer>row= new HashMap<>();
        HashMap<String,Integer>col= new HashMap<>();


        String eachCol = "";
        String eachRow = "";

        int count=0;
        int count1=0;


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                eachCol= eachCol+grid[j][i]+",";
                eachRow= eachRow+grid[i][j]+",";

            }
            row.put(eachRow,row.getOrDefault(eachRow,0)+1);
            col.put(eachCol,col.getOrDefault(eachCol,0)+1);

            eachCol="";
            eachRow="";
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                eachCol= eachCol+grid[j][i]+",";
                eachRow= eachRow+grid[i][j]+",";

            }

            if(row.containsKey(eachCol)){
                count= count+ row.get(eachCol);
                System.out.println(count1);


            }
            if(col.containsKey(eachRow)){
                count1= count1+ col.get(eachRow);
                System.out.println(count1);


            }
            eachCol="";
            eachRow="";
        }



        return Math.max(count1, count);
    }
}
