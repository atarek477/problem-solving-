package arrays_2d;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        int[][] matrix= new int[n][n];
        int count =1;

        int left = 0, up = 0, right = n - 1, down = n - 1;

        while(count-1 < n * n){
            for(int i = left; i <= right && count-1 < n * n; i++)
            {
                matrix[up][i]=count;
                count++;
            }
            for(int i = up + 1; i < down && count-1 < n * n; i++)
            {
                matrix[i][right]=count;
                count++;
            }
            for(int i = right; i >= left && count-1 < n * n; i--)
            {
                matrix[down][i]=count;
                count++;
            }
            for(int i = down - 1; i > up && count-1 < n * n; i--)
            {
                matrix[i][left]=count;
                count++;
            }

            left++; right--; up++; down--;
        }

        return matrix;
    }

}
