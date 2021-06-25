import java.util.*;

public class subsets {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scn.nextInt();
        }
        int total = (int)Math.pow(2 , n);
        for(int deci=0;deci<total;deci++){
            //binary to set
            int bin = deciToBin(deci);
            
            int div = (int)Math.pow(10, n-1);
            for(int i=0;i<n;i++){
                int bit = bin / div;
                if(bit==0){
                    System.out.print("-	");  //0 or 1
                }
                else{
                     System.out.print(a[i]+"	");
                }
                bin = bin % div;
                div = div/10;
            }
             System.out.println();
        }
     }
     public static int deciToBin(int d){
          int ans=0;
           int pow=1;
           while(d!=0)
           {
               int rem = d%2;
               ans = ans + rem * pow;
               d=d/2;
               pow= pow*10;
           }
           return ans;
       }
}
