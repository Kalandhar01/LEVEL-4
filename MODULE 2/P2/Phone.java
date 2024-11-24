
import java.util.Scanner;
public class Phone{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] arr = {"0","0","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            StringBuilder sb= new StringBuilder();
        String s = sc.nextLine();
        for(char c : s.toCharArray()){
            int num = Character.getNumericValue(c);
            if(num > 1){
           sb.append(arr[num]);
           sb.append(" ");
            }
            else {
            System.out.println("No Combination of Strings");
            return;
            }
            
        }
        // System.out.print(sb);
        String sol = sb.toString();
        String[] arr1 = sol.split(" ");
        
        if(arr1.length>1){
                String m1= arr1[0];
                String m2= arr1[1];
                
                char[] temp1= m1.toCharArray();
                char[] temp2= m2.toCharArray();
            for(int i=0;i<m1.length();i++){
                for(int j=0;j<m2.length();j++){
                    System.out.print(temp1[i]);
                    System.out.print(temp2[j] + " ");
                }
            }
      
        }else{
            String m3 = arr1[0];
            for(int i=0;i<m3.length();i++){
                System.out.print(m3.charAt(i) +" ");
            }
        }
        
        
        
    }
}