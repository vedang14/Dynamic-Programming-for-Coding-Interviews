public class towerOfHanoi {
    public static void move(char s,char d, char e,int n){
        if(n<=0){
        System.out.println("I didn't able to execute ");
        return ;
        }
        System.out.println("before first call triggered by "+ n + " "+ s +" "+ d +" "+e );
        move(s,e,d,n-1);
        System.out.println("i got triggered next from "+  n + " "+ s +" "+ d +" "+e );
        System.out.println("move disk "+ n + " from "+ s +" to "+ d);
        move(e,d,s,n-1);
        System.out.println("afer last call triggered by "+ n + " "+ s +" "+ d +" "+e +"\n");
    }
    public static void main(String args[]){
        move('s','d','e',3);
        
    }
}