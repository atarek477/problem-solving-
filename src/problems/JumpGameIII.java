package problems;

public class JumpGameIII {

    public boolean canReach(int[] arr, int start) {


        int[] visited=new int[arr.length];
        return dfs(arr,start,visited);

    }

    public boolean dfs(int [] arr,int start,int[] visited){
       if (start<0||start>=arr.length||visited[start]==1)
           return false;

       visited[start]=1;
       if (arr[start]==0)
           return true;

       return dfs(arr,start-arr[start],visited)||dfs(arr,start+arr[start],visited);

    }



}
