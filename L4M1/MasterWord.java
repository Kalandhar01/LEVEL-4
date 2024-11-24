// MASTER WORD
import java.util.Scanner;
public class MasterWord{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        boolean firstisdigit = true;
        boolean secondisvowel = true;
        boolean thirddigit = false;
        boolean vowel=false;
        boolean num2Digit=false;
        boolean lastS=false;
       char last = s.charAt(s.length()-1);
       if(last =='{' || last =='[' || last=='}' || last==']'){
           lastS = true;
       }
        
      char first = s.charAt(0);
      
      
      //rule 1 
      if(first >='0' && first<='9'){
          firstisdigit = false;
          
      }
      //rule2 not a vowel
      char second = s.charAt(1);
      
      if(second =='a' || second =='e' || second =='i' || second=='o' || second=='u' || second =='A'
            || second =='E' || second =='I' || second =='O' || second=='U' ){
          secondisvowel = false;
      }
      
      //rule 3 one or more digit 
      StringBuilder num1sb = new StringBuilder();
      int index =2;
    while(isDigit(s.charAt(index))){
        num1sb.append(s.charAt(index));
       thirddigit = true;
       index++;
    }
    
    // System.out.println("NUM1 :"+num1sb);
    //rule 4 one or more vowel 
    
    while(isUpperVowel(s.charAt(index))){
        vowel = true;
        index++;
    }
     
     //rule 5 one or more digit
    StringBuilder num2sb = new StringBuilder();
    while(isDigit(s.charAt(index))){
        num2sb.append(s.charAt(index));
        num2Digit = true;
        index++;
    }
    // System.out.println("NUM2 :"+num2sb);
    int num1 = Integer.parseInt(num1sb.toString());
    int num2 = Integer.parseInt(num2sb.toString());
    
    //final check()
        if(firstisdigit && secondisvowel && thirddigit && vowel && num2Digit && lastS){
            System.out.print("YES " + (num1+num2));
        }else{
            System.out.print("NO " + (num1-num2));
        }
    
      
      
      
        
    }
    
    public static boolean isDigit(char c){
        if(c>='0' && c<='9') return true;
        return false;
    }
    
    public static boolean isUpperVowel(char c){
        if(c=='A' || c=='E'|| c== 'I'|| c=='O'||c=='U') return true;
        return false;
    }
}