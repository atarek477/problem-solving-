package hashtable_or_mab;

public class CustomSortString {

    public String customSortString(String order, String s) {

        StringBuilder result= new StringBuilder();
        StringBuilder rest= new StringBuilder();
        int[] temp = new int[200];
        for (int i = 0; i <s.length() ; i++) {
            if (order.contains(String.valueOf(s.charAt(i))))
            temp[s.charAt(i)]++;
            else {
                rest.append(s.charAt(i));}

        }
        for (int i = 0; i <order.length() ; i++) {

            if (temp[order.charAt(i)]>0){
                result.append(String.valueOf(order.charAt(i)).repeat(Math.max(0, temp[order.charAt(i)])));


            }

        }


return result.toString() +rest;
    }



}
