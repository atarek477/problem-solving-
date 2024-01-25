package problems;

public class UglyNumber {
    public boolean isUgly(int n) {

        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            return true;
        }else{
            for(i=2;i<=m;i++){
                if((n%i==0)&&(i==2||i==3||i==5) ){
                    return true;
                }
            }
        }
        return false;
    }
}
