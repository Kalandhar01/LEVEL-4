
import java.util.Arrays;
import java.util.Scanner;
public class StandingStudentsMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        // System.out.println(s);
        String[] ar= s.split(" ");
        int[] arr1  = new int[n];
        int[] arr2  = new int[n];
        int k=0;
        for(String c : ar){
            arr1[k] = Integer.parseInt(c);
            arr2[k] = Integer.parseInt(c);
            k++;
        }
        
        Arrays.sort(arr1);
        int c=0;
        for(int i=0;i<n;i++){
            if(arr1[i] != arr2[i]) c++;
        }
    System.out.print(c);
        
}
}