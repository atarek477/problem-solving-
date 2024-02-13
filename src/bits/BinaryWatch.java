package bits;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> list= new ArrayList<>();
int count=0;
String temp = "";
        for (int i = 0; i <12; i++) {
            for (int j = 0; j <60 ; j++) {
            if (  Integer.bitCount(i )+ Integer.bitCount(j)==turnedOn){


                list.add(i+":"+String.format("%02d", j));


            }
            }
        }

return list;
    }
}
