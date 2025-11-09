import java.util.Scanner;
import java.util.Arrays;
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] s) {
        Arrays.sort(s);
        String f = s[0];
        String l = s[s.length-1];
        String ans = "";
        for(int i=0;i<Math.min(f.length(),l.length());i++) {
            if(f.charAt(i) != l.charAt(i)) {
            break;
            }
            ans += f.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Words seperated by spaces : ");
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        String res = longestCommonPrefix(arr);
        System.out.println(res);
    }
}
