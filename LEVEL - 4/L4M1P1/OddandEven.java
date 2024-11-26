import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even.add(i);
            }else odd.add(i);
        }
        int k=0;
        int c=0;
        Collections.sort(odd);
        Collections.reverse(odd);
        // System.out.println(odd);
        while(k!=odd.size() && c!=even.size()){
            System.out.print(odd.get(k++)+ " " + even.get(c++) + " ");
          
        }
        if(n%2!=0) System.out.print(odd.get(k));
    }
}