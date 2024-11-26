
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FindSecondFrequent{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       char[] arr = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        
       for(char t : arr ){
          map.put(t,map.getOrDefault(t,0) + 1);
       }
       ArrayList<Character> list = new ArrayList<>();
       
       for(Map.Entry <Character, Integer> m:map.entrySet()){
        //   System.out.println(m.getKey() +  "  : " + m.getValue());
           list.add(m.getKey());
       }
       if(list.size()>1){
           System.out.println("Second most frequent character is " + list.get(1));
       }
       else{
           System.out.println("No Second most frequent character");
       }
       
       
    }
}