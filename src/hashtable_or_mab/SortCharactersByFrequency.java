package hashtable_or_mab;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {



        int []map = new int[125];
        StringBuilder stringBuilder= new StringBuilder();

        HashMap<Character, Integer>hashMap= new HashMap<>();
        for (int i = 0; i <s.length(); i++) {
            if(!hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i),1);
                continue;
            }

            hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
        }
        LinkedHashMap<Character, Integer> sortedHashMap = new LinkedHashMap<>();
        hashMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedHashMap.put(x.getKey(), x.getValue()));
        sortedHashMap.forEach((key, value) -> stringBuilder.insert(0,String.valueOf(key).repeat(Math.max(0, value))));


        return stringBuilder.toString();
    }
}
