
import java.util.*;

public class broken_economy {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        
        for(int x=0;x<n;x++){
            a[x] = scn.nextInt();
        }
        int d = scn.nextInt();
         int ceil = -1000000000;
         int floor = -1000000000;
         
        int i=0;
        int j=a.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(a[mid] < d ){
               floor = a[mid];
                i = mid +1;
            }
            else if(a[mid] > d ){
                ceil = a[mid];
                j = mid-1;
            }
            else{
                ceil = floor = mid;
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
     }
    
}
