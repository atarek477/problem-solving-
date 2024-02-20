package string;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        System.out.println("here");
        Map<String,String> hashMap = new HashMap<>();
        List<List<String>> list= new ArrayList<>();

        for (int i = 0; i <strs.length; i++) {
            char[] charArray = strs[i].toCharArray();

            Arrays.sort(charArray);

            String sortedStr = new String(charArray);

            if (hashMap.isEmpty() || !hashMap.containsKey(sortedStr)) {

                hashMap.put(sortedStr, strs[i].isEmpty() ?  "\"" + "\"" : strs[i]);

            } else {

                hashMap.put(sortedStr, hashMap.get(sortedStr)+","+(strs[i].isEmpty() ?  "\"" + "\""  : strs[i]));



            }
        }

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String[] split = entry.getValue().split(",");
            System.out.println(split.length);
            List<String>list1 = new ArrayList<>();
            for (int i = 0; i <split.length ; i++) {
                list1.add(split[i].equals("\"\"") ? "" : split[i]);

            }
            list.add(list1);
        }
        return list;
    }
}
