
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrowNum{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        int k =1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1){
                    a.add(k);
                }
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
        
        Collections.reverse(a);
        
        for(int i=0;i<n;i++){
            k = a.get(i);
            for(int j=1;j<=n-i;j++){
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}