import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Histogram{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        ArrayList<Integer> list = new ArrayList<>();
      
        while(matcher.find()){
            list.add(Integer.parseInt(matcher.group()));
        }

        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        
   
        int max=0;
        for(int i=0;i<arr.length;i++){
            int left = i;
            int right = i;
        
        while(left>0 && arr[left-1]>= arr[i]){
            left--;
        }
        
        while(right<arr.length-1 && arr[right+1]>= arr[i]){
            right++;
        }
        int width = right- left+1;
        int vol = width*arr[i];
        max = Math.max(max,vol);
    
        }
        System.out.println(max);
        
        
        
    }
}