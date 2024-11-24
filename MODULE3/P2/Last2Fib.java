
import java.util.Scanner;
public class Last2Fib
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0)
        {
            System.out.print(0);
        }
        if(n==1)
        {
            System.out.print(1);
        }
        if(n==2)
        {
            System.out.print(1);
        }
        
        int a=0;
        int b=1;
        int c=a+b;
        for(int i=3;i<=n;i++)
        {
            a=b;
            b=c;
            c=a+b;
        }
        String s = Integer.toString(c);
       
        if(s.length()==1)
        {
            System.out.print("0"+s);
            // return;
            
        }
        else{
            
        
        char c1 = s.charAt(s.length()-1);
        char c2 = s.charAt(s.length()-2);
        System.out.print(c2);
        System.out.print(c1);
        
        }
        // System.out.print(c);
    }
}



























// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int fib = check(n);
//         int ans  = (fib%100);
        
//         String last = lastDigit(fib);
//         // String s = Integer.toString(fib);
//         // System.out.println(last);
        
//     }
    
//     public static int check(int n){
//         if( n==0) return 0;
//         else if(n==1) return 1;
//         return (check(n-1) + check(n-2));
//     }
    
//     public static String lastDigit(int n ){
//         StringBuilder sb = new StringBuilder();
        
//         while(n>0){
//             int r = n%10;
//             sb.append(r);
//             n/=10;
//         }
        
//         String s1 = sb.toString();
//         System.out.print(s1);
        
//         return s1;
      
//     }
// }