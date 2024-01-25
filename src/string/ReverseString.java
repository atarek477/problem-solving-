package string;

public class ReverseString {

    public void reverseString(char[] s) {
        char swap = 0;
        for (int i = 0; i < (s.length/2); i++) {
            swap =s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=swap;


        }
    }
}
