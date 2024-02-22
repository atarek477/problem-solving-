package problems;

import java.util.*;

public class FindPlayersWithZeroorOneLosses {

    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> listList = new ArrayList<>();
        Set<Integer> list1=  new TreeSet<>();
        Set<Integer> list2 = new TreeSet<>();
        int row = matches.length;
        HashMap<Integer,Integer>hashMap= new HashMap<>();

        for (int i = 0; i < row; i++) {
            if(!hashMap.containsKey(matches[i][1])){
                hashMap.put(matches[i][1],1);
                continue;
            }
            hashMap.put(matches[i][1],hashMap.get(matches[i][1])+1);
        }

        for (int i = 0; i < row; i++) {
            if (!hashMap.containsKey(matches[i][0])) {
                list1.add(matches[i][0]);
            }
            if (hashMap.get(matches[i][1]) == 1) {
                list2.add(matches[i][1]);
            }
        }
        listList.add(new ArrayList<>(list1));
        listList.add(new ArrayList<>(list2));
        return listList;
    }


}
