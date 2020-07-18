
public class editDistance {
    static int min(int x, int y, int z) 
    { 
        if (x <= y && x <= z) 
            return x; 
        if (y <= x && y <= z) 
            return y; 
        else
            return z; 
    } 
    public static int d,u,i ;
    public static int find(final String s1, final String s2,int n,int m) {
        if (n==0)
            return m;
        if (m==0)
            return n;
        if (s1.charAt(n-1) == s2.charAt(m-1))
            return find(s1, s2,n-1,m-1);

        return min(find(s1, s2,n-1,m),
                   find(s1, s2,n-1,m-1),
                   find(s1, s2,n,m-1))+1;
    }

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