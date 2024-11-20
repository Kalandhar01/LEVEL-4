import java.util.Scanner;
public class StringRotate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String ans = s1+s1;
        // System.out.println(ans);
        if(ans.contains(s2)){
            System.out.println("true");
        }else  System.out.println("false");
    }
    }
}