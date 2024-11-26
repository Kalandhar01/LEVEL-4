import java.util.Scanner;

public class Pascal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("** Printing the pattern... **");
        for(int i=0;i<n;i++){
            
            //space 
            for(int j=n-1;j>i;j--){
                System.out.print(" ");
            }
            
            int k =1;
            for(int j=0;j<=i;j++){
                System.out.print(k+" ");
                k=(k*(i-j))/(j+1);
            }
            System.out.println();
        }
    }
}