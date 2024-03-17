package string;

public class AddStrings {

    public static String addStrings(String num1, String num2) {

        StringBuilder result= new StringBuilder();
        StringBuilder s1=new StringBuilder(num1);
        StringBuilder s2=new StringBuilder(num2);

        int carry=0;
        int sum;
        int resul;
        int count1= num1.length()-1;
        int count2= num2.length()-1;

        if (count2>count1){
          s1.insert(0, "0".repeat(count2-count1));
        }else {

            s2.insert(0, "0".repeat(count1-count2));

        }
        count2=s2.length()-1;
        count1=s1.length()-1;


        while (count1>=0&&count2>=0){
            resul=((s1.charAt(count1)-48)+(s2.charAt(count2)-48)+carry);
            sum=resul%10;
            carry=resul/10;
            result.insert(0, sum);
  count2--;
  count1--;

        }
if (carry>0)
    result.insert(0,carry);


return result.toString();

    }

}
