public class ques1 {
    public static int find(int n,int m){
        int arr[][] = new int[n][m];
        arr[0][0] = 0;
        for(int i=1;i<m;i++)
            arr[0][i] = 1;
        for(int j=1;j<n;j++)
            arr[j][0] = 1;
        for(int i=1;i<n;i++){
            for(int j =1;j<m;j++){
                arr[i][j] = arr[i-1][j]+arr[i][j-1];
            }
        }
        return arr[n-1][m-1];
    }

    public static void main(String args[]){
    int n =  8, m =9;
    final long startTime = System.nanoTime();
    System.out.println(find(n,m));
    final long endTime = System.nanoTime();
    final long timeElapsed = endTime-startTime;
    System.out.println(timeElapsed/1000000);
    }
}