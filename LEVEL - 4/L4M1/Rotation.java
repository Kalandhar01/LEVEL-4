import java.util.Scanner;
public class Rotation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int test= 1;test<=t;test++){
            String s = sc.next();
            char[] arr =s.toCharArray();
            int tar = sc.nextInt();
            
            
            if(test%2==0){
                for(int i=1;i<=tar;i++){
                    right(arr);
                }
            }else{
                for(int i=1;i<=tar;i++){
                    leftRotation(arr);
                }
            }
            
            
            for(char c : arr){
                System.out.print(c);
            }
            
            System.out.println();
        }
    }
    
    public static void right(char[] arr){
        char right = arr[arr.length-1];
        for(int i=arr.length-1;i>=1;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = right;
    }
    public static void leftRotation(char[] arr){
        char left = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = left;
    }
}