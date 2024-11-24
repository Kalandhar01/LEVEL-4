
import java.util.Scanner;
public class SubStringLowerCase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length()<26){
            System.out.println("-1");
            return;
        }
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        int prev =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] =='?'){
                char t = (char)(prev+1);
                
                sb.append(t);
                prev = (int) t;
            }
            else {
                sb.append(arr[i]);
                prev = (int) arr[i];
                
            }
              
        }
       
                System.out.println(sb);
       
        
        
        
        
    }
}