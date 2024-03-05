package twopointer;

public class MinimumLengthofStringAfterDeletingSimilarEnds {
    public static int minimumLength(String s) {


        StringBuilder stringBuilder = new StringBuilder(s);
        int left = 0;
        int right = (s.length() - 1);


        while (left <right && s.charAt(left) == s.charAt(right)) {
            char ch = s.charAt(left);
            while (left <= right && s.charAt(left) == ch) {
                left++;
            }
            while (left <= right && s.charAt(right) == ch) {
                right--;
            }


        }
        return left - right + 1;
    }

}



