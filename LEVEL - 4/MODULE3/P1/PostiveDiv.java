
import java.util.Scanner;
public class PostiveDiv{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int in = sc.nextInt();
            if(check(in)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
    public static boolean check(int n){
        int c =0;
        for(int i=1;i<n;i++){
            if(n%i == 0){
                c+=i;
            }
        }
        // System.out.println(c);
        if(c==n){
            return true;
        }else return false;
        
    }
}