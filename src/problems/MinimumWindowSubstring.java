package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        if (t.length() > s.length())
            return "";


        HashMap<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int minLength = Integer.MAX_VALUE;
        String minWindow = "";
        int left = 0, count = 0;


        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);


            if (targetMap.containsKey(rightChar)) {
                targetMap.put(rightChar, targetMap.get(rightChar) - 1);
                if (targetMap.get(rightChar) >= 0) {
                    count++;
                }
            }


            while (count == t.length()) {

                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minWindow = s.substring(left, right + 1);
                }

                char leftChar = s.charAt(left);

                if (targetMap.containsKey(leftChar)) {
                    targetMap.put(leftChar, targetMap.get(leftChar) + 1);
                    if (targetMap.get(leftChar) > 0) {
                        count--;
                    }
                }
                left++;
            }
        }

        return minWindow;
    }
}
