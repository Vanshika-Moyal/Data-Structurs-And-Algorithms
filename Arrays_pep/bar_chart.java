import java.util.*;
public class bar_chart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
     
    for(int i=0;i<n;i++){
        a[i]=scn.nextInt();
    }
    
    int max = a[0];
    for(int i=1;i<n;i++){
        if(max < a[i]){
            max = a[i];
        }
    }
    
    for(int i=max;i>=1;i--){
        for(int j=0;j<n;j++){
            if(a[j] < i){
                System.out.print("	");
            }
            else{
                 System.out.print("*	");
            }
        }
         System.out.println();
    }
    }
}
