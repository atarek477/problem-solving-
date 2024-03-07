package problems;

public class BreakPalindrome {

    public String breakPalindrome(String palindrome) {

       StringBuilder stringBuilder= new StringBuilder(palindrome);
      if (palindrome.length()==1)
            return "";
        else {
            for (int i = 0; i <palindrome.length()/2 ; i++) {
                if (palindrome.charAt(i)!='a')
                  return stringBuilder.replace(i,i+1, "b").toString();
            }
        }
       return stringBuilder.replace(palindrome.length()-1,palindrome.length(), "b").toString();
    }

}
