package problems;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map1=new int[200];
        int[] map2=new int[200];
        if(ransomNote.length()>magazine.length())
            return false;
        for (int i = 0; i < magazine.length(); i++) {
            map1[magazine.charAt(i)]++;
            if(i<ransomNote.length()){
                map2[ransomNote.charAt(i)]++;

            }

        }
        for (int i = 0; i <ransomNote.length() ; i++) {
            if(map2[ransomNote.charAt(i)]>map1[ransomNote.charAt(i)]){
                return false;

            }

        }

        return true;
    }
}
