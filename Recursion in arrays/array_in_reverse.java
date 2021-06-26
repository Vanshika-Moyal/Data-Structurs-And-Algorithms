import java.util.*;

public class array_in_reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        displayArrReverse(arr, 0);
    }

        public static void displayArrReverse(int[] arr , int idx) {
           if(idx==arr.length){
               return;
           }
            displayArrReverse(arr, idx+1);
            System.out.println(arr[idx]);
        }
    
}