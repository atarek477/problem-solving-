package arrays_2d;

public class IslandPerimeter {


    public int islandPerimeter(int[][] grid) {
        int lengthRow = grid.length;
        int lengthCol = grid[0].length;
        int count = 0;
        for (int i = 0; i < lengthRow; i++) {
            for (int j = 0; j < lengthCol; j++) {
                if (grid[i][j] == 1) {
                    if (i - 1 < 0) {
                        count++;
                    } else if (grid[i - 1][j] == 0) {
                        count++;

                    }
                    if (i + 1 == lengthRow) {
                        count++;
                    } else if (grid[i + 1][j] == 0) {
                        count++;

                    }
                    if (j - 1 < 0) {
                        count++;
                    } else if (grid[i][j - 1] == 0) {
                        count++;

                    }
                    if (j + 1 == lengthCol) {
                        count++;
                    } else if (grid[i][j + 1] == 0) {
                        count++;

                    }


                }

            }
        }
        return count;
    }
}
