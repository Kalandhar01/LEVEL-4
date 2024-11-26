
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HighestFrequency{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=s.replace(".","");
        String[] arr = s.split(" ");
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String c : arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        int max = 0;
        String s1 ="";
       for(Map.Entry<String,Integer> entry : map.entrySet()){
           if(max<entry.getValue() && entry.getValue() != 1){
               s1=entry.getKey();
               max = entry.getValue();
           }
           
       }
       
       if(max>0){
       System.out.println(s1);
       }
       else {
           System.out.println("None");
       }
    }
}