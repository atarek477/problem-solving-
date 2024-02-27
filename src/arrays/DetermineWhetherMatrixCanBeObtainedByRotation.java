package arrays;

import java.util.Arrays;

public class DetermineWhetherMatrixCanBeObtainedByRotation {

    public boolean findRotation(int[][] mat, int[][] target) {

        int row = mat.length;
        int temp = 0;
        int count = 0;
      if(Arrays.deepEquals(mat,target))
        return true;

        for (int v = 0; v<3 ;v++) {


            int[][] result = new int[row][row];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row; j++) {
                    result[i][j] = mat[row - 1 - j][i];


                }

            }
            if(Arrays.deepEquals(result,target))
                return true;

            mat = result;


        }


        return false;
    }
}
