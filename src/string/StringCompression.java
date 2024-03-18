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

    public static int compress1(char[] chars) {
        if (chars == null || chars.length == 0) return 0;

        int writePointer = 0; // Pointer for writing compressed characters
        int count = 1; // Initialize count of current character

        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++; // Increment count if current character is same as next character
            } else {
                chars[writePointer++] = chars[i]; // Write current character

                if (count > 1) {
                    // Write count as characters
                    String countStr = String.valueOf(count);
                    for (char c : countStr.toCharArray()) {
                        chars[writePointer++] = c;
                    }
                }

                count = 1; // Reset count for next character
            }
        }

        return writePointer; // Return the length of the compressed array
    }


}
