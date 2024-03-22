package hashtable_or_mab;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberofOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        int[] map =new int[2001];
        Set<Integer> set= new HashSet<>();
        for (int j : arr) {

            map[j + 1000]++;
        }

        for (int j : map) {
            if (j != 0 && set.contains(j))
                return false;

            set.add(j);
        }
        return true;
    }
    
}
