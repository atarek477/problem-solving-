package string;

public class IsSubsequence
{
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty())
            return true;



        int j=0;
        for (int i = 0; i <t.length() ; i++) {
            if(t.charAt(i)==s.charAt(j)){
                System.out.println("here");
                j++;
            }

            if (j==s.length())
                return true;

        }


        return false;

    }

}
