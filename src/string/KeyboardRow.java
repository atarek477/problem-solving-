package string;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {

    public String[] findWords(String[] words) {

        int count = 0;
        List<String>list=new ArrayList<>();
        for (int i = 0; i < words.length; i++) {

            if ("qwertyuiopQWERTYUIOP".indexOf(words[i].charAt(0))>-1) {
                for (int j = 0; j < words[i].length(); j++) {

                    if ("qwertyuiopQWERTYUIOP".indexOf(words[i].charAt(j)) > -1)
                        count++;
                }

            } else if ("asdfghjklASDFGHJKL".indexOf(words[i].charAt(0))>-1) {

                for (int j = 0; j < words[i].length(); j++) {
                    if ("asdfghjklASDFGHJKL".indexOf(words[i].charAt(j)) > -1)
                        count++;
                }
            } else {
                for (int j = 0; j < words[i].length(); j++) {
                    if ("zxcvbnmZXCVBNM".indexOf(words[i].charAt(j)) > -1)
                        count++;
                }

            }
            System.out.println(count);
            if (count==words[i].length())
                list.add(words[i]);

            count=0;
            count=0;
            System.out.println();

            System.out.println();
            System.out.println();
            System.out.println();


        }
        return list.toArray(new String[0]);
    }
}
