
import java.util.ArrayList;
import java.util.Scanner;
public class SpiralLeft{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr= new int[r][c];
        
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                arr[i][j] = sc.nextInt(); 
            }
        }
        
        
        int top=0, bottom = r-1;
        int left =0 , right = c-1;
        ArrayList<Integer> l = new ArrayList<>();
        
        while(top<=bottom && left<=right){
            
            for(int i=top;i<=bottom; i++){
                // l.add(arr[i][left]);
                System.out.print(arr[i][left] + " ");
            }
            left++;
            
            for(int i=left;i<=right;i++){
                System.out.print(arr[bottom][i] + " ");
                // l.add(arr[bottom][i]);
            }
            bottom--;
            
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                System.out.print(arr[i][right] +" ");
                    // l.add(arr[i][right]);
                }
                right--;
            }
            
            
            if(top<=bottom){
                for(int i=right ;i>=left;i--){
                    // l.add(arr[top][i]);
                System.out.print(arr[top][i] +" ");
                }
                top++;
            }
            
        }
        
        // for(int i=0;i<l.size();i++){
        //     System.out.print(l.get(i)+ " ");
        // }
        
    }
}
