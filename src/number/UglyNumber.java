package number;

public class UglyNumber {
    public static boolean isUgly(int n) {

        while (n>=5&&n%5==0){n=n/5;}
        while (n>=3&&n%3==0){n=n/3;}
        while (n>=2&&n%2==0){n=n/2;}

        return n==1;

    }
}
