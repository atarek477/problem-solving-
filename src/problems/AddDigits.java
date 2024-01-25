package problems;

public class AddDigits {


    // My solution not optimal takes around 1ms
    public static int addDigits(int num) {
        int sum=0;
        do{
            sum= sum+(num%10);
            num=num/10;
            if(num/10==0){
                num=num+sum;
                sum=0;
            }
        }while(num/10!=0);
return num;
    }

}
