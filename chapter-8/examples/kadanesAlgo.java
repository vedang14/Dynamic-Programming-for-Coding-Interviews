public class kadanesAlgo {
    public static int kadanes(int arr[]){
        int n = arr.length;
        int maxSoFar = Integer.MIN_VALUE;
        int localMax = 0;
        for(int i=0;i<n;i++){
            localMax += arr[i];
            maxSoFar = Math.max(localMax,maxSoFar);
            if(localMax<0)
                localMax = 0;
        }
        return maxSoFar;
    }
    public static void main(String args[]){
        int arr[] = {-2233,-4,-2,-45,-13,-454};
        System.out.println(kadanes(arr));
    }
}