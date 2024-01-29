package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        backtracking(result, new ArrayList(), nums);
        return result;

    }

    public void backtracking(List<List<Integer>> list , ArrayList<Integer> list1 , int[] nums){
      if(list1.size()==nums.length){
          list.add(new ArrayList<>(list1));
          return;

      }


        for (int number :nums
             ) {
            if (list1.contains(number))
                continue;

            list1.add(number);
            Arrays.stream(nums).forEach(System.out::println);
            backtracking(list,list1, nums);
            list1.remove(list1.size()-1);






        }

    }




}
