
import java.util.*;


public class subarray {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        
        for(int i=0;i<n;i++){
            a[i]= scn.nextInt();
        }
        
        for(int s=0;s<n;s++){
            for(int e=s;e<n;e++){
                for(int i=s;i<=e;i++){
                    System.out.print(a[i]+"	");
                }
                 System.out.println();
            }
        }
     }
}
