package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LongestPalindrome {


    public int longestPalindrome(String s) {
        HashMap<Character,Integer>hashMap= new HashMap<>();
        TreeSet<Integer> set= new TreeSet<>();
        int flag=0;
        int result=0;
        for (int i = 0; i <s.length() ; i++) {
            if(!hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i),1);
                continue;


            }
            hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);


        }
        for (Map.Entry<Character,Integer> entry:hashMap.entrySet()
        ) {
            if(entry.getValue()%2==0){
                result=result+entry.getValue();
            }else {
                result=result+(entry.getValue()-1);
                set.add(entry.getValue());

            }

        }
        if(!set.isEmpty()){
            result =result-set.last() +(set.last()+1);}
        return result;

    }
}
