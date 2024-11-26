import java.util.Scanner;
public class RemoveUnbalace
{
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int k =0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
           if(arr[i] == '(' && (arr[i+1] >='a' && arr[i+1]<='z')){
               k=i;
               while(arr[k] != ')'){
                   sb.append(arr[k++]);
               }
               sb.append(")");
               break;
           }
        }
        System.out.println(sb);
    }
}