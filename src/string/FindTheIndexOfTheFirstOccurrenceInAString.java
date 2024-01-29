package string;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr1(String haystack, String needle) {

        return haystack.indexOf(needle);

    }

    public int strStr(String haystack, String needle) {
        int j=-1;
        for (int i = 0; i <haystack.length()+1 ; i++) {
            j++;
            if(j!=(needle.length())&&
                    i!=(haystack.length())&&haystack.charAt(i)==needle.charAt(j)){
                continue;}
            if(j==needle.length()){
                return i-j;
            }
            i=i-j;
            j=-1;
        }
        return -1;
    }

}
