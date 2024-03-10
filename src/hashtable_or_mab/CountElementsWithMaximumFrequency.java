package hashtable_or_mab;

public class CountElementsWithMaximumFrequency {

    public int maxFrequencyElements(int[] nums) {
        int [] temp= new int[101];

        for (int j : nums) {
            temp[j]++;}

        int freq = temp[1];
        int num  = temp[1];
        for (int i = 2; i <temp.length ; i++) {

            if(freq<temp[i]){
                freq= temp[i];
                num= temp[i];


            } else if (freq==temp[i]) {
                num= num+temp[i];
            }
        }
        return num;
    }




}
