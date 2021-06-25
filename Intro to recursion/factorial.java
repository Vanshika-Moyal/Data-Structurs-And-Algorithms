import java.io.*;
import java.util.*;

public class factorial {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int f = fact(n);
        System.out.println(f);
    }

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        int fn1 = fact(n-1);
        int fn = n * fn1;
        return fn;
    }
}
