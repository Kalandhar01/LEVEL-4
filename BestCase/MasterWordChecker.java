import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MasterWordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the input: ");
        String in = sc.nextLine();
   
        String regex = "^[^0-9][^aeiouAEIOU](\\d+)([AEIOU]+)(\\d+)[\\[\\{\\}]$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(in);
            ArrayList<Integer> list = new ArrayList<>();

        if (matcher.matches()) {
            int num1 = Integer.parseInt(matcher.group(1));
            int num2 = Integer.parseInt(matcher.group(3)); 
            
            System.out.println("YES " + (num1 + num2));
        } else {
            String r = "\\d+";
            int sub = 0;
       Pattern pat = Pattern.compile(r);
            Matcher match = pat.matcher(in);
            while(match.find()){
                list.add(Integer.parseInt(match.group()));
            }
            // System.out.println(list);
            
            if(list.size()>2){
                int n1 = list.get(1);
                int n2 = list.get(2);
                System.out.println("NO "+ (n1-n2));
                return;
            }else{
                int n11 = list.get(1);
                int n22 = list.get(0);
                System.out.println("NO " + (n22-n11));
                return;
            }
           
        

        }
        
        scanner.close();
    }
}
