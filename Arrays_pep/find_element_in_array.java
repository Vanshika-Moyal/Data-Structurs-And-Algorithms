import java.util.*;

public class find_element_in_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int[] a = new int[n];
    for(int i=0;i<n;i++){
        a[i]= scn.nextInt();
    }
    int toFind = scn.nextInt();
    
    int idx=-1;
    for(int i=0;i<n;i++){
        if(a[i] == toFind){
            idx = i;
            break;
        }
    }
    System.out.println(idx);

    }
}
