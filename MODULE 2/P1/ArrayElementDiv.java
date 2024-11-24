import java.util.Scanner;
public class ArrayElementDiv{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        
        for(int i=0;i<n;i++){
        int c=1;
            for(int j=0;j<n;j++){
                if(i!=j && arr[j]%arr[i]== 0){
                   c++;
                }
            }
            if(c==n){
                System.out.println(arr[i]);
                return;
            }
        }
        
        System.out.println("-1");
        
    }
}