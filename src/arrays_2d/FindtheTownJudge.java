package arrays_2d;

public class FindtheTownJudge {

    public int findJudge(int n, int[][] trust) {

        int count=0;
        int[] map1 =new int[n+1];
        int[] map2 =new int[n+1];

        int row =trust.length;
        //int col = trust[0].length;
        for (int i = 0; i < row; i++) {
            map1[trust[i][0]]++;
            map2[trust[i][1]]++;

        }

        for (int i = 1; i <map2.length; i++) {
            if(map1[i]==0&&map2[i]==(n-1))
                return i;

        }
        return -1;


    }
}
