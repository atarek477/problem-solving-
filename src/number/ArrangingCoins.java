package number;

public class ArrangingCoins {
    public int arrangeCoins(int n) {

        int count =0;
        int i=2;
        while(n>0){
            n=n-i;
            i++;
            count++; }
        return count ;
    }
}
