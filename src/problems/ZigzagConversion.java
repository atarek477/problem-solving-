package problems;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {

        int count= (2*numRows)-2;
        int point=0;
        int pointer=0;
        int min =0;
        int flag =0;
        StringBuilder stringBuilder= new StringBuilder();

        if(s.length()<3||numRows==1)
            return s;

        while (point<s.length()){
            stringBuilder.append(s.charAt(point));
            point=point+count;
        }
        while (stringBuilder.length()!=s.length()){
            if(point>=s.length()){
                count=count-2;
                flag=0;
                min=min+2;
                pointer++;
                point= pointer;

            }

            if (min==(2*numRows)-2||count==0)
            {
                count=(2*numRows)-2;
                min=(2*numRows)-2;
            }


            if (flag==0){
                stringBuilder.append(s.charAt(point));
            point=point+count;

            }

            if (flag==1){
                stringBuilder.append(s.charAt(point));
                point=point+min;
            }
            flag=1^flag;

        }
      return stringBuilder.toString();
    }


}
