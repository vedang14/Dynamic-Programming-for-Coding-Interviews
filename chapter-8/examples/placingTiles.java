public class placingTiles {
    public static int find(int n){
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        if(n==2)
        return 2;
        
        return find(n-1)+find(n-2);
    }
    public static void main(String args[]){
        final long startTime = System.nanoTime();
        int n = 5;
        int ans= find(n);
        System.out.println(ans);
        final long endTime = System.nanoTime();
        final long timeElapsed = endTime-startTime;
        System.out.println(timeElapsed/1000000);
    }
}