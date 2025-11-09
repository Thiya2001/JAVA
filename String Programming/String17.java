import java.util.Scanner;
public class String17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String s = sc.nextLine();
        System.out.println(isCountChar(s));
    }
    public static String isCountChar(String s) {
        char a[] = s.toCharArray();
        int count = 1;
        String ans = "";
        for(int i=0;i<a.length-1;i++) {
            if(a[i] == a[i + 1])
            count++;
            else {
                ans = ans + a[i] + count;
                count = 1;
            }
        }
        ans = ans + a[a.length - 1] + count;
        return ans;
    }
}