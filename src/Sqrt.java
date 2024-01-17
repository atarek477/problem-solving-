public class Sqrt {
    public static int mySqrt(int x) {
      int i=1;
      int count= 0;
        while ( x>=0){
            x=x-i;
            i=i+2;
            count++;
        }
return count-1;
    }

}
