
import java.util.Arrays;
import java.util.Scanner;
public class CommonPrefix{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s  = sc.nextLine();
        String[] arr = s.split(" ");
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        
        char[] n1 = arr[0].toCharArray();
        char[] n2 = arr[1].toCharArray();
        char[] n3 = arr[2].toCharArray();
        int i =0;
       while(i<n3.length){
           if(n1[i] != n2[i] && n2[i] != n3[i]){
               System.out.println(sb);
               return;
           }
           sb.append(n1[i]);
           i++;
       }
       System.out.println(arr[0]);
        
           
        
 }
}