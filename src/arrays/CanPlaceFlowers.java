package arrays;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;



        for (int i = 0; i <flowerbed.length ; i++) {


            if (flowerbed[i] == 1)
                continue;
            if (i - 1 >= 0 && i + 1 < flowerbed.length) {

                if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    count++;
                    flowerbed[i] = 1;
                }

                continue;

            }
            if (i + 1 >= flowerbed.length && i - 1 >= 0) {

                if (flowerbed[i - 1] == 0) {
                    count++;
                    flowerbed[i] = 1;
                }
                continue;
            }


            if (i + 1 < flowerbed.length && i - 1 < 0) {

                if (flowerbed[i + 1] == 0) {

                    count++;
                    flowerbed[i] = 1;
                }
                continue;

            }

            if (i + 1 >= flowerbed.length && i - 1 < 0) {

                if (flowerbed[i] == 0) {

                    count++;
                    flowerbed[i] = 1;
                }
                continue;

            }
        }
        if (count>=n)
            return true;


        return false;

    }
}
