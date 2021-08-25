import java.io.*;
import java.util.*;

public class prefix_eva_conv {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
    
        // code
        Stack<Integer> value = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<String> infix = new Stack<>();
        
        for(int i = exp.length()-1; i>=0; i--){
            char ch = exp.charAt(i);
            
            if(ch >= '0' && ch <= '9'){
                value.push(ch - '0');
                prefix.push(""+ch);
                infix.push(""+ch);
            }
            else{
                int b = value.pop();
                int a = value.pop();
                
                if(ch == '+'){
                    value.push(a+b);
                }
                else if(ch == '-'){
                    value.push(b-a);
                }
                else if(ch == '*'){
                    value.push(a*b);
                }
                else{
                    value.push(b/a);
                }
                
                String v2 = prefix.pop();
                String v1 = prefix.pop();
                prefix.push(v2+v1+ch);
                
                v2 = infix.pop();
                v1 = infix.pop();
                infix.push("(" + v2+ch+v1+ ")");
            }
        }
        System.out.println(value.pop());
        System.out.println(infix.pop());
        System.out.println(prefix.pop());
     }
}
