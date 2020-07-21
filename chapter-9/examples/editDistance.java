
public class editDistance {

    //2. Bottom-Up Dynaminc Approach
    public static int find(String s1,String s2,int n,int m){
        int arr[][] = new int[n+1][m+1];
        for(int i=0;i<=m;i++){
            arr[0][i] = i;
        }
        
        for(int j=0;j<=n;j++){
            arr[j][0] = j;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                arr[i][j] = arr[i-1][j-1];
                else
                arr[i][j] = min(arr[i-1][j],arr[i][j-1],arr[i-1][j-1])+1;
            }
        }
        return arr[n][m];
    }

    static int min(int x, int y, int z) 
            { 
                if (x <= y && x <= z) 
                    return x; 
                if (y <= x && y <= z) 
                    return y; 
                else
                    return z; 
            } 

    // 1. Recursive Solution

            // public static int d,u,i ;
            // public static int find(final String s1, final String s2,int n,int m) {
            //     if (n==0)
            //         return m;
            //     if (m==0)
            //         return n;
            //     if (s1.charAt(n-1) == s2.charAt(m-1))
            //         return find(s1, s2,n-1,m-1);

            //     return min(find(s1, s2,n-1,m),
            //                find(s1, s2,n-1,m-1),
            //                find(s1, s2,n,m-1))+1;
            // }

    public static void main(final String args[]) {
        final long startTime = System.nanoTime();
        final String s1 = "Sunday";
        final String s2 = "Saturday";
        int n = s1.length();
        int m = s2.length();
        System.out.println(find(s1,s2,n,m));
        final long endTime = System.nanoTime();
        final long timeElapsed = endTime-startTime;
        System.out.println(timeElapsed/1000000);
    }
}