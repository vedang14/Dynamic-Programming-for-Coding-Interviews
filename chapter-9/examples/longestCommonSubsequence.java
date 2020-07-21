import javax.lang.model.util.ElementScanner6;

public class longestCommonSubsequence {
    public static int Mem[][] = new int[34][6];
    
    // 3. Dynamic Approach
    public static int find(String s1,String s2,int n,int m){
        int arr[][] = new int[n+1][m+1];
        for(int i=0;i<=m;i++)
            arr[0][i] = 0;
        for(int j=0;j<=n;j++)
            arr[j][0] = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    arr[i][j] = 1+arr[i-1][j-1];
                else
                    arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
            }
        }
        return arr[n][m];
    }

    // 2. Memoized Solution
        // public static int n=0,m=0;
        // public static int find(String s1, String s2,int n,int m){
        //     if(n==0 || m==0)
        //         return 0;
        //     if(Mem[n][m]!=0)
        //     return Mem[n][m];

        //     if(s1.charAt(n)==s2.charAt(m))
        //     Mem[n][m] = 1+ find(s1,s2,n-1,m-1);
        //     else
        //     Mem[n][m] = Math.max(find(s1,s2,n-1,m),find(s1,s2,n,m-1));

        //     return Mem[n][m];
        // }
    
    // 1. Recursive Solution
    // public static int find(String s1, String s2,int n,int m){
    //     if(n==0 || m==0)
    //         return 0;
    //     if(s1.charAt(n-1)==s2.charAt(m-1))
    //         return 1+ find(s1,s2,n-1,m-1);
    //     else
    //     return Math.max(find(s1,s2,n-1,m),find(s1,s2,n,m-1));

    // }
    public static void main(String args[]){
        final long startTime = System.nanoTime();
        String s1 = "ABCDFRTTDFFGSGFGRGFSGERTTRRFBSYGF";
        String s2 = "CDXZXZXZGF";
        int n = s1.length();
        int m = s2.length();
        int len = find(s1,s2,n,m);

        //printing lcs :
        char compute[] = new char[len];
        len--;
        int i = n, j = m;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                compute[len] = s1.charAt(i);
                i--;
                j--;
                len--;
            }
            else if( Mem[i-1][j]>Mem[i][j-1])
                i--;
            else 
                j--;
        }
        System.out.println(compute.toString());
        final long endTime = System.nanoTime();
        final long timeElapsed = endTime-startTime;
        System.out.println(timeElapsed/1000000);
    }
}