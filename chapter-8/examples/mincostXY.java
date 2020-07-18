public class mincostXY {

    // 1. Using Recursion
    //     public static int findMin(int arr[][],int x,int y){
    //         if(x==0 && y==0)
    //         return arr[0][0];

    //         if(x==0)
    //         return findMin(arr,x,y-1) + arr[0][y];

    //         if(y==0)
    //         return findMin(arr,x-1,y) + arr[x][0];

    //         int right = findMin(arr,x-1,y);
    //         int bottom = findMin(arr,x,y-1);

    //         return Math.min(right,bottom)+ arr[x][y];
    // } 
    //2. Optimzing recursion call using memoiszation
        public static int Mem[][] = new int[3][4];
        // public static int findMin(int arr[][],int x,int y){
        //     if(Mem[x][y]!=0)
        //     return Mem[x][y];

        //     if(x==0 && y==0)
        //     Mem[x][y] =  arr[0][0];
            
        //     else if(x==0)
        //         Mem[x][y] = findMin(arr,x,y-1)+arr[0][y];
            
        //     else if(y==0)
        //         Mem[x][y] = findMin(arr,x-1,y)+arr[x][0];
        //     else{
        //         int left = findMin(arr,x-1,y);
        //         int right = findMin(arr,x,y-1);
        //         Mem[x][y] = Math.min(left,right)+arr[x][y];
        //     }
        //     return Mem[x][y];
        // }

        // 3. Optimizng with use of Bootom-Up Approach
        public static int findMin(int arr[][],int x,int y){
            Mem[0][0] = arr[0][0];

            //fixing up for top row
            for(int i=1;i<arr[0].length;i++)
            Mem[0][i] = Mem[0][i-1]+arr[0][i];

            //fixing up last col 
            for(int j=1;j<arr.length;j++)
            Mem[j][0] = Mem[j-1][0]+ arr[j][0] ;

            for(int i=1;i<arr.length;i++){
                for(int j=1;j<arr[0].length;j++){
                    Mem[i][j] = Math.min(Mem[i-1][j],Mem[i][j-1]) + arr[i][j];
                }
            }
            return Mem[x][y];
        }
        

    public static void main(final String args[]){
        final long startTime = System.nanoTime();
        final int arr[][] = { {1,3,5,8} ,
                        {4,2,1,7},
                        {4,3,2,3} } ;
        final int x = 2,y = 3;
        final int ans = findMin(arr,x,y);
        System.out.println(ans);
        final long endTime = System.nanoTime();
        final long timeElapsed = endTime-startTime;
        System.out.println(timeElapsed/1000000);
    }
}