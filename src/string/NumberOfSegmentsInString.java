package string;

import java.util.StringTokenizer;

public class NumberOfSegmentsInString {

    public int countSegments(String s) {
        StringTokenizer st = new StringTokenizer(s);
        return st.countTokens();
    }
}
