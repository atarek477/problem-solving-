package string;

import java.util.Arrays;


import java.util.stream.Collectors;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        String result= Arrays.stream(s.split("[^a-zA-Z0-9]"))
                .filter(str->!str.isEmpty() )
                .collect(Collectors.joining("") )
                .toLowerCase();

        for (int i = 0; i <result.length() ; i++) {
            if (result.charAt(i)!=result.charAt(result.length()-i-1))
                return false;
        }
        return true;
    }
}
