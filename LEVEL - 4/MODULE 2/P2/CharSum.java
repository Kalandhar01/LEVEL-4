
import java.util.Scanner;
public class CharSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String f = sc.nextLine();
        String s = sc.nextLine();
        String t = sc.nextLine();
        
        int num1  = check(f.toCharArray());
        int num2  = check(s.toCharArray());
        int sum  = check(t.toCharArray());
            if((num1+num2) == sum){
                System.out.println("true");
            }else
                System.out.println("false");
    
    }
    
    
    public static int check(char[] arr){
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : arr){
            int val = (c - 'a');
           
               sb.append(val);
            
        }
        return Integer.parseInt(sb.toString());
    }
}