import java.io.*;
import java.util.*;


public class power_log {
    
    public static void main(String[] args) throws Exception {
        // write your code here
          Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
         int n = scn.nextInt();
         int ans = power(x, n);
         System.out.println(ans);
    }

    public static int power(int x, int n){
       if(n==0){
            return 1;
        }
        int fa = power(x, n/2);
         if(n%2==0){
            int ans = fa*fa;
            return ans;
        }
        else{
           int ans = fa*fa*x;
           return ans;
        }
    }

}
