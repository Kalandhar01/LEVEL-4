
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GrandSon{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> a = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            a.add(arr[1]);//father
            a.add(arr[0]);//son5
        }
        
        String f=sc.nextLine();
        String o="";
        for(int i=0;i<a.size();i++){
            if(f.equals(a.get(i))){
                if(!f.equals(a.get(i+1))){
                    o = a.get(i+1); 
                }
            }
        }
        
        int c=0;
        for(int i=0;i<a.size();i++){
            if(o.equals(a.get(i))){
                c++;
            }
        }
        System.out.println(c-1);
    }
}