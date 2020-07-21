public class Knapsack {

    // 2. Dynamic Programming Solution
    public static int find(int val[],int wt[],int W,int n){
        int arr[][] = new int[n+1][W+1];

        for(int i=0;i<=W;i++){
            arr[0][i] = 0;
        }
        for(int j=0;j<=n;j++){
            arr[j][0] = 0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                if(wt[i-1]<=j){
                    int x = j-wt[i-1];
                    arr[i][j] = Math.max(val[i-1]+arr[i-1][x],arr[i-1][j]);
                }
                else
                    arr[i][j] = arr[i-1][j];
            }
        }
        return arr[n][W]; 
    }

    // 1. Recursive Solution
        // public static int find(int val[],int wt[],int W,int n){
        //     if(n==0 || W==0)
        //         return 0;
        //     if(wt[n-1]>W)
        //         return find(val,wt,W,n-1);
        //     else{
        //         return Math.max(val[n-1]+find(val,wt,W-wt[n-1],n-1),find(val,wt,W,n-1));
        //     }
        // }
    public static void main(String args[]){
        int val[] = {60,100,120};
        int wt[] = {10,20,30};
        int W = 50;
        int n = val.length;
        System.out.println(find(val,wt,W,n));
    }
}