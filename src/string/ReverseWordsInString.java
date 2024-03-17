package string;

import java.util.Objects;

public class ReverseWordsInString {


    public String reverseWords(String s) {

        String[] temp= s.split(" ");
        StringBuilder result= new StringBuilder();
        for (int i = temp.length-1; i >=0 ; i--) {
            if (!Objects.equals(temp[i], " "))
             result.append(" ").append(temp[i]);
        }
        return result.toString().trim();

    }




}
