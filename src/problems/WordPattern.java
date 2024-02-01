package problems;

import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] x = s.split(" ");
        StringBuilder p = new StringBuilder();
        HashMap<Character, String> hashMap = new HashMap<>();

        if (x.length != pattern.length())
            return false;

        for (int i = 0; i < x.length; i++) {
            if (hashMap.isEmpty() || !hashMap.containsValue(x[i])) {
                hashMap.put(pattern.charAt(i), x[i]);


            }
        }


        for (int i = x.length - 1; i >= 0; i--) {

            p.insert(0, hashMap.get(pattern.charAt(i)) + " ");

        }

        if (p.toString().trim().equals(s))
            return true;
        return false;
    }
}
