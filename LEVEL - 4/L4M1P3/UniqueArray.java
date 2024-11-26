import java.util.*;
public class UniqueArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int t = 0;t<testCase;t++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int max =0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i] > max){
                    max = arr[i];
                }
            }
           int k = 1;
           int sum =1;
           
           sum= arr[arr.length-1] * k++ + max;
        
        for(int i=0;i<n-1;i++){
            sum+=arr[i]*k+max;
            k++;
        }
          System.out.println(sum);
            
        
        }
    }
}