public class cutttingRod {
    public static int Mem[] = new int[9];
    // 3. Dynamic Programming Solution
    public static int find(int value[],int n){
        Mem[0] = 0;
        for(int i=1;i<=n;i++){
            Mem[i] = Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                Mem[i] = Math.max(Mem[i],value[j]+Mem[i-j-1]);
            }
        }
        return Mem[n];
         
    }

    // 2. Memoized Solution

        // public static int find(int value[],int n){
        //     if(n<=0)
        //     return 0;
        //     if(Mem[n]!=0)
        //         return Mem[n];

        //     Mem[n] = Integer.MIN_VALUE;
            
        //     for(int i=1;i<=n;i++){
        //         Mem[n] = Math.max(Mem[n],value[i-1]+find(value,n-1));
        //     }
            

        //     return Mem[n];

        // }

    // 1. Recursive Solution
        // public static int find(int value[],int n){
        //     if(n<=0)
        //     return 0;

        //     int max = Integer.MIN_VALUE;

        //     for(int i=1;i<=n;i++){
        //         int res = value[i-1]+ find(value,n-i);
        //         max = Math.max(max,res);
        //     }
        //     return max;
        // }
    public static void main(String args[]){
        int n = 8;
        int value[] = {1,5,8,9,10,17,17,20};
        System.out.println(find(value,4));
    }
}