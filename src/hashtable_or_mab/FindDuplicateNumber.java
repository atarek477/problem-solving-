package hashtable_or_mab;

public class FindDuplicateNumber {

    public int findDuplicate(int[] nums) {

        int []map= new int[nums.length];
        for (int i = 0; i <map.length ; i++) {
            if (map[nums[i]]>1)
                return map[i];

            map[nums[i]]++;

        }

       return 0;
    }

}
