import java.io.*;
import java.util.*;

public class print_inc_dec {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printInc_dec(n);
    }

    public static void printInc_dec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printInc_dec(n-1);
        System.out.println(n);
    }
}
