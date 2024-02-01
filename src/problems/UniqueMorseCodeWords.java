package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set= new HashSet<>();
        HashMap<Character,String> hashMap= new HashMap<>();
        hashMap.put('a',".-");
        hashMap.put('b',"-...");
        hashMap.put('c',"-.-.");
        hashMap.put('d',"-..");
        hashMap.put('e',".");
        hashMap.put('f',"..-.");
        hashMap.put('g',"--.");
        hashMap.put('h',"....");
        hashMap.put('i',"..");
        hashMap.put('j',".---");
        hashMap.put('k',"-.-");
        hashMap.put('l',".-..");
        hashMap.put('m',"--");
        hashMap.put('n',"-.");
        hashMap.put('o',"---");
        hashMap.put('p',".--.");
        hashMap.put('q',"--.-");
        hashMap.put('r',".-.");
        hashMap.put('s',"...");
        hashMap.put('t',"-");
        hashMap.put('u',"..-");
        hashMap.put('v',"...-");
        hashMap.put('w',".--");
        hashMap.put('x',"-..-");
        hashMap.put('y',"-.--");
        hashMap.put('z',"--..");

        StringBuilder s= new StringBuilder();
        for (int i = 0; i <words.length ; i++)
        {
            for (int j = 0; j < words[i].length(); j++) {

                s.append(hashMap.get(words[i].charAt(j)));

            }
            System.out.println(s);
            set.add(String.valueOf(s));
            s.delete(0,s.length());
        }




return set.size();
    }


}
