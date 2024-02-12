package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int[] map = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            map[nums[i]]++;

        }
        for (int i = 1; i < map.length; i++) {
            if (map[i] == 0) {
                list.add(i);

            }

        }


        return list;
    }


}
