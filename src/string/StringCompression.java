package string;

public class StringCompression {
    public static int compress(char[] chars) {

        if (chars.length==1)
            return 1;
        int count =1;
        int pointer=0;
        int flag=0;
        int flag2=0;

        for (int i = 0; i <chars.length-1 ; i++) {
            if (i==chars.length-2)
                flag=1;
            if (chars[i]==chars[i+1])
            {
                count++;

            }
            if(chars[i]!=chars[i+1]||flag==1){
                System.out.println(count);
                if (chars[i]!=chars[i+1]&&flag==1){
                    flag2=1;

                }


                if (count>1&&count<10){
                    chars[pointer]=chars[i];
                    pointer++;
                    chars[pointer]= Character.forDigit(count,10);
                    pointer++;
                }
                if (count<100&&count>=10){
                    chars[pointer]=chars[i];
                    pointer++;
                    chars[pointer]= Character.forDigit(count/10,10);
                    pointer++;
                    chars[pointer]= Character.forDigit(count%10,10);
                    pointer++;
                }
                if (count<1000&&count>=100){

                    chars[pointer]=chars[i];
                    pointer++;
                    chars[pointer]= Character.forDigit(count/100,10);

                    pointer++;


                    chars[pointer]= Character.forDigit(count%10,10);
                    pointer++;
                    count=count/10;
                    chars[pointer]= Character.forDigit(count%10,10);
                    pointer++;
                }
                if (count>=1000){
                    chars[pointer]=chars[i];
                    pointer++;
                    chars[pointer]= Character.forDigit(count/1000,10);
                    pointer++;
                    chars[pointer]= Character.forDigit(count%10,10);
                    pointer++;
                    count=count/10;
                    chars[pointer]= Character.forDigit(count%10,10);
                    pointer++;
                    count=count/10;
                    chars[pointer]= Character.forDigit(count%10,10);
                    pointer++;
                }

                if (count==1){
                    chars[pointer]=chars[i];
                    pointer++;

                } if (flag2==1){
                    chars[pointer]=chars[i+1];
                    pointer++;

                }

                count=1;
            }
        }

        return pointer;
    }

}
