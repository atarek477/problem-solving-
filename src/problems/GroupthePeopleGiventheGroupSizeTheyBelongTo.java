package problems;

import java.util.ArrayList;
import java.util.List;

public class GroupthePeopleGiventheGroupSizeTheyBelongTo {

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list= new ArrayList<>();
        int totalsize=0;
        for (int i = 0; i <groupSizes.length ; i++) {
            int j=i+1;
            int size=groupSizes[i]-1;
            List<Integer> list1= new ArrayList<>();
            if(groupSizes[i]!=0)
            list1.add(i);
           while (j<groupSizes.length&&size!=0){
               if(groupSizes[j]==groupSizes[i]&&groupSizes[j]!=0) {
                   list1.add(j);
                   groupSizes[j]=0;
                   size--;
                   totalsize++;
               }
                     j++;
            }


            if (!list1.isEmpty())
                list.add(list1);


        }


return list;
    }
}
