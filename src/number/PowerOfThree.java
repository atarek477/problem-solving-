package number;

public class PowerOfThree {

    // my solution not optimal solution
    public boolean isPowerOfThree1(int n) {

        for(int i=0;i<20;i++){
            if(Math.pow(3,i)==n){

                return true;
            }
        }
        return false;
    }

    public boolean isPowerOfThree(int n) {


        if(n==1){
            return true;
        }

        if((n%3)!=0 || n==0){
            return false;
        }

        return isPowerOfThree(n/3);


    }




}
