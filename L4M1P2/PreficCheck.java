
import java.util.Scanner;
public class PreficCheck{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int n=1;n<=t;n++){
            
            String s =sc.nextLine();;
            int c = check(s.toCharArray() , s.length());
            
            System.out.println(c);
            
        }
    }
    
    public static int check(char[] arr, int n){
        int c =0;
        int sum =0;
        for(int i=0;i<n;i++){
            int k =0;
            c=0;
            
            for(int j=i;j<n;j++){
                if(arr[k++] != arr[j]){
                    break;
                }else
                    c++;
            }
            sum+=c;
        }
        // System.out.print(c);
        return sum;
    }
}