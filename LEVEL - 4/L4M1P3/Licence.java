import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Licence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toLowerCase();
        String target = sc.nextLine();
        String[] sp = target.split(" ");
        ArrayList<Character> list = new ArrayList<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                list.add(c);
            }
        }

        int[] arr = new int[26];
        for (char c : list) {
            int num = c - 'a';
            arr[num]++;
        }

        int min = Integer.MAX_VALUE;
        String result = null;

        for (String t : sp) {
            int[] temp = Arrays.copyOf(arr, arr.length);
            for (char c : t.toCharArray()) {
                if (Character.isLetter(c)) {
                    int num = c - 'a';
                    temp[num]--;
                }
            }

            if (isTrue(temp)) {
                if (t.length() < min) {
                    min = t.length();
                    result = t;
                }
            }
        }

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("No match found");
        }
    }

    public static boolean isTrue(int[] arr) {
        for (int n : arr) {
            if (n > 0) {
                return false;
            }
        }
        return true;
    }
}
