
import java.util.Scanner;
public class RotaterVowels{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        
        int i=0;
        int j = arr.length-1;
        
        while(i<j){
            if(!vowel(arr[i])){
                i++;
            }
            if(!vowel(arr[j])){
                j--;
            }
            
            else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
        }
        
        for(char c : arr){
            System.out.print(c);
        }
        
        
        
        
        
    }
    
    public static boolean vowel(char a){
        if(a=='a' || a == 'e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E'
        || a=='I'|| a=='O' || a=='U'){
            return true;
        }
        return false;
    }
    
    
    
}