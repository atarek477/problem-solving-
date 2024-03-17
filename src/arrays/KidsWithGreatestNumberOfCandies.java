package arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>list= new ArrayList<>();
        int max =candies[0];

        for (int i = 1; i <candies.length ; i++) {

            if (max<candies[i]){
                max=candies[i];
            }
        }
        for (int i = 0; i <candies.length ; i++) {
            if(candies[i]+extraCandies>=max){
                list.add(true);
                continue;
            }
            list.add(false);
        }
      return list;

    }

}
