package L4M1P4;

public class Baskets {
    
}
import java.util.Scanner;
public class Baskets{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for(int num : arr){
            sum+=num;
        }
        // System.out.println(sum);
        int di = sum/n;
        int mov =0;
        for(int i=0;i<n;i++){
            if(arr[i]>di){
                mov+= (arr[i]-di);
            }
        }
        
        System.out.println("No of moves = "+ mov);
    }
}



// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int sum =0;
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//             sum+=arr[i];
//         }
//         int to = sum/n;
//         int mov =0;
//         for(int i =0;i<n;i++){
//                 if(arr[i]>to)
//                 {
//                     mov+=(arr[i]-to);
//                 }
//         }
//       System.out.println("No of moves = " + mov);
      
      
//     }  
// }