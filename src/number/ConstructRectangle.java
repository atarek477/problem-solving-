package number;

public class ConstructRectangle {

    public static int[] constructRectangle(int area) {
        int[]result= new int[2];
        int left = ((int) Math.sqrt(area));
        int right = ((int) Math.sqrt(area));
        while (right<area||left>0){
            if (left*right==area)
            {
                result[1]=left;
                result[0]=right;
                return result;

            } else if (left*right<area) {
                right++;

            } else  {

                left--;
            }


        }



     return result;

    }

}
