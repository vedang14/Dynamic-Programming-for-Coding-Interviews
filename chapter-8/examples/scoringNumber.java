
public class scoringNumber {
    //Recursive Solution
    public static int find(int n){
        if(n==0)
        return 1;

        if(n<0)
        return 0;

        return find(n-3)+find(n-5)+find(n-10);
    }

    //Memoized Solution
    // public static int find(int n){
    //     int arr[] = new int[n+1];
    //     arr[0] = 1;
    //     for(int i=1;i<=n;i++){
    //         if((i-3)>=0)
    //             arr[i] += arr[i-3];

    //         if((i-5)>=0){
    //             arr[i] += arr[i-5];
    //         }
    //         if((i-10)>=0)
    //             arr[i] += arr[i-10];
    //     }
    //     return arr[n];
    // }
    public static void main(String args[]){
        // only obtainable ponts are 10,5, and 3;
        final long startTime = System.nanoTime();
        int n =53;
        System.out.println(find(n));
        final long endTime = System.nanoTime();
        final long timeElapsed = endTime-startTime;
        System.out.println(timeElapsed/1000000);
    }
}