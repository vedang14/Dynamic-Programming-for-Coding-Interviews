import java.util.Arrays;

public class coinChangeProblem {

    // 2. Dynamic programming Approach
    public static int find(int arr[],int sum){
        int dp[] = new int[sum+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=1;i<=sum;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]<=i){
                    int temp = dp[i-arr[j]];
                    if(temp!= Integer.MAX_VALUE && temp+1< dp[i])
                        dp[i] = temp+1;
                }
            }
        }
        return dp[sum];
    }
    // 1. Recursive Solution
        // public static int find(int arr[],int sum){
        //     if(sum==0)
        //     return 0;
        //     int res = Integer.MAX_VALUE;

        //     for(int i=0;i<arr.length;i++){
        //        if(arr[i]<=sum){
        //             int temp = find(arr,sum-arr[i]);
        //             if(temp!= Integer.MAX_VALUE && temp+1<res)
        //                 res = temp+1;
        //         }
        //     }
        //     return res; 
        // }
    public static void main(String args[]){
        int arr[] = {25,10,11};
        int sum = 1223;
        System.out.println(find(arr,sum));
    }
}