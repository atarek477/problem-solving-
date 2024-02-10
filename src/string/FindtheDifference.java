package string;

import java.util.HashSet;

public class FindtheDifference {
    public char findTheDifference(String s, String t) {


        int count =0;
        for (char c:t.toCharArray()
        ) {
            count=count+c;
        }
        for (char c:
                s.toCharArray()) {
            count=count-c;
        }

        return (char) count;
    }

}
