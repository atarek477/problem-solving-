package number;

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


    // optimal solution
    public static  int addDigits1(int num )
    {
        int sum =0 ;
        while(num>0){
            sum = sum+(num%10);
            num = num /10;

        }
        return (sum<10)?sum:addDigits1(sum);



    }

}
