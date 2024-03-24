package hashtable_or_mab;

import java.util.Arrays;
import java.util.HashMap;

public class DetermineifTwoStringsAreClose {

    public boolean closeStrings(String word1, String word2) {

      int []map1= new int[26];
      int []map2= new int[26];
        for (int i = 0; i <word1.length() ; i++) {
            map1[word1.charAt(i)-'a']++;

        }
        for (int i = 0; i <word2.length() ; i++) {
            map2[word2.charAt(i)-'a']++;

        }
        for (int i = 0; i <map2.length ; i++) {
            if ((map1[i]==0&&map2[i]!=0)||(map2[i]==0&&map1[i]!=0))
                return false;
        }

        Arrays.sort(map1);
        Arrays.sort(map2);
        for (int i = 0; i <map2.length ; i++) {
            if (map2[i]!=map1[i])
                return false;

        }

        return true;
    }


}
