package string;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {

       String s1= word.toLowerCase();
       String s2= word.toUpperCase();
       int count=0;
        int count1=0;
        int count2=0;


        for (int i = 0; i <word.length() ; i++) {

            count =count+ word.charAt(i);
            count1 =count1+ s1.charAt(i);
            count2 =count2+ s2.charAt(i);

            }
            if (count-count1==0||count-count2==0||((s1.charAt(0)-word.charAt(0)==32)&&count1-count==32)){
    return true;

        }


return false;
        }

    }



