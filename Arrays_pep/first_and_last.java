
import java.util.*;

public class first_and_last {
    public static int[] searchRange(int[] nums, int d) {
        //Write your code here
        int n = nums.length;
        int i=0;
        int j = n-1;
        int first = -1;
        
         while(i<=j){
       int mid = (i+j)/2;
       if(nums[mid] < d ){
           i = mid +1;
       }
       else if(d < nums[mid]  ){
           j = mid-1;
       }
       else{
           first = mid;
           j=mid-1;
       }
   }

        int last =-1;
         i=0;
         j = n-1;
    while(i<=j){
       int mid = (i+j)/2;
       if(nums[mid] < d ){
           i = mid +1;
       }
       else if(d < nums[mid]  ){
           j = mid-1;
       }
       else{
           last = mid;
           i=mid+1;
       }
   }
   
   return new int[]{first, last};
   }

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int[] A = new int[sc.nextInt()];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        int[] res = searchRange(A, sc.nextInt());
        for (int a : res) {
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
