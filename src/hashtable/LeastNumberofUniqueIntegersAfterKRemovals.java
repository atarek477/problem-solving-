package hashtable;

import java.util.*;

public class LeastNumberofUniqueIntegersAfterKRemovals {
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> hashMap = new HashMap<>();

        for (int j : arr) {
            if (hashMap.isEmpty() || !hashMap.containsKey(j)) {
                hashMap.put(j, 1);
            } else {
                hashMap.put(j, hashMap.get(j)+1);
            }
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(hashMap.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        for (int i = 0; i < entryList.size(); i++) {
            Map.Entry<Integer, Integer> entry = entryList.get(i);

            if(entry.getValue()==1){
                hashMap.remove(entry.getKey());
                k=k-1;
            }
            else {
                if(k- entry.getValue()>=0){
                    k=k- entry.getValue();
                    hashMap.remove(entry.getKey());
                }else{
                    k=0;
                }
            }
            if (k==0){
                return hashMap.size();

            }

        }


        return 1;
    }

}
