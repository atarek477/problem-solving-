package arrays_2d;

public class FlippingImage {

    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int column =image[0].length;
       int [][]swap = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <column ; j++) {
                swap[i][j]=image[i][column-j-1]^1;

            }
        }
     return swap;
    }
}
