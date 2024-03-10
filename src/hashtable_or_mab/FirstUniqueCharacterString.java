package hashtable_or_mab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FirstUniqueCharacterString {
    public static int firstUniqChar(String s) {
        int min=s.length();
        HashMap<Character,Integer>hashMap= new HashMap<>();
        List<Integer> list= new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if(hashMap.isEmpty()||!hashMap.containsKey(s.charAt(i))){

                hashMap.put(s.charAt(i),i);


            }else {
                hashMap.put(s.charAt(i),-1);

            }


        }

        for (int value : hashMap.values()) {
            if (value != -1&&min>value) {
                min=value;
            }

        }

        return (min==s.length())?-1:min;


    }



}
