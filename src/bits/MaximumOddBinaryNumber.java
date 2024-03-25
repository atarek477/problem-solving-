package bits;

public class MaximumOddBinaryNumber {

    public String maximumOddBinaryNumber(String s) {
        int count=0 ;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='1')
                count++;
        }
        StringBuilder result= new StringBuilder();
        int x=count--;
        while (count>0)
        {
            result.append("1");
           count--;
        }
        result.append("0".repeat(Math.max(0, (s.length() - x))));
        result.append("1");

        return result.toString();
    }

}
