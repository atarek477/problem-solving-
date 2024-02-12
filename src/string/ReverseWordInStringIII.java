package string;

public class ReverseWordInStringIII {
    public String reverseWords(String s) {
        String[] temp = s.split(" ");
        String result="";
        for (int i = 0; i < temp.length ; i++) {
            result= result+" "+new StringBuilder(temp[i]).reverse().toString();

        }

        return result.trim();



    }
}
