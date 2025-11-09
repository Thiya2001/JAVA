import java.util.Scanner;
public class Recursion1 {
    static Scanner sc = new Scanner(System.in);
    static int start = 1, end;
    public static void solve() {
        if(start <= end){
            System.out.println(start + " ");
            start++;
            solve();
        }
        return;
    }
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        end = sc.nextInt();
        solve();
    }
}
