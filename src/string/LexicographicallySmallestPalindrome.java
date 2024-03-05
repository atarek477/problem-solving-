package string;

public class LexicographicallySmallestPalindrome {
    public String makeSmallestPalindrome(String s) {

        int count=s.length()-1;
        StringBuilder stringBuilder= new StringBuilder(s);

        for (int i = 0; i <s.length()/2 ; i++) {

            if(s.charAt(i)<s.charAt(count)){
                stringBuilder.replace(count,count+1, String.valueOf(s.charAt(i)));
                }
            else if(s.charAt(i)>s.charAt(count)){
                stringBuilder.replace(i,i+1, String.valueOf(s.charAt(count)));

            }
            count--;

        }

        return stringBuilder.toString();
    }
}
