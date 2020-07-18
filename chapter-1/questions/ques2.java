import java.util.ArrayList;

public class ques2 {
    static ArrayList<Integer>ls = new ArrayList<Integer>();
    public static ArrayList<Integer> compute(int arr[],int i,int n,int sum){
        if(i==n+1)
        return ls;
        sum+= arr[i];
        ls.add(sum);
        return compute(arr,i+1,n,sum);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length-1;
        ls = compute(arr,0,n,0);
        for(int i :  ls){
            System.out.println(i);  
        }

    }    
}