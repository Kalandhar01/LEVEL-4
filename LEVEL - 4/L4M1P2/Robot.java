import java.util.Scanner;
public class Robot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = 0;
        int r = 0;
        int u = 0;
        int d = 0;
        
        for(char c : s.toCharArray()){
            if(c == 'L'){
                l++;
            }else if(c == 'R'){
                r++;
            }
            else if(c == 'U'){
                u++;
            }else{
                d++;
            }
        }
        
        if(l == r && u == d){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}