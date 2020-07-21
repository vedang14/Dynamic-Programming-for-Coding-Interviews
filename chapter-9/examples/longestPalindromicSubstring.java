public class longestPalindromicSubstring {

        // 2. Dynamic Prpgramming Approach
        public static int find(int start,String s,int end){
            if(s== null ||  s== "")
                return 0;
            int arr[][] = new int[end][end];

            for(int i=0;i<end;i++)
                arr[i][i] = 1;
            for(int k =2;k<=end;k++){
                for(int i=0;i<end-k-1;i++){
                    int j = i+k-1;
                    if(s.charAt(i)==s.charAt(j) && k==2)
                        arr[i][j] = 2;
                    else if(s.charAt(i)==s.charAt(j))
                        arr[i][j] = arr[i+1][j-1]+2;
                    else
                        arr[i][j] = Math.max(arr[i][j-1],arr[i+1][j]);
                }       
             }
            return arr[0][end-1];
         }
        
        // 1. Recursive Approach
            // public static int find(int start,String s,int end){
            //     if(start>end)
            //         return 0;
            //     if(start==end)
            //         return 1;
            //     if(s.charAt(start)==s.charAt(end))
            //         return find(start+1,s,end-1)+2;
            //     else
            //         return Math.max(find(start+1,s,end),find(start,s,end-1));
            // }
        public static void main(String args[]){
            String s = "BBABCBCAB";
            System.out.println(find(0,s,s.length()));
        }        
}