import java.util.Scanner;
import java.util.Stack;
public class VlaidParantheses{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int t=1;t<=n;t++){
            String s = sc.nextLine();
           char[] arr = s.toCharArray();
           
           if(check(arr)){
               System.out.println("True");
           }else
               System.out.println("False");
            
        }
    }
    
    public static boolean check(char[] arr){
        Stack<Character> s = new Stack<>();
        for(char c : arr){
            if(c=='(' || c=='{' || c=='['){
                s.push(c);
        }
            else if(c==']' || c=='}' || c==')'){
                if(s.isEmpty()){
                    return false;
                }
                char top = s.pop();
                if( (c==')' && top!='(') ||
                    (c=='}' && top!= '{') || 
                    (c=='[' && top!= '[')){
                        return false;
                    }
            }
    }
    return s.isEmpty();
    
    }
    
}