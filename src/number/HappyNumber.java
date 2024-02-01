package number;


public class HappyNumber {
    public static boolean isHappy(int n) {
        int x;
        int sum;
        int count =0;
    while (count!=100){
        sum=0;
        while (n != 0) {

            x = n % 10;
            //System.out.println(x);
            n = n / 10;
            sum = (int) (sum + Math.pow(x, 2));

        }
        if (sum == 1) {
            return true;
        } else {
            n = sum;
           // System.out.println(n);
        }
count++;
    }
        return false;
    }

}
