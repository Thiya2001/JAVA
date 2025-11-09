import java.util.Scanner;
public class Method17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = sc.nextInt();
        boolean res = palindrome(n);
        System.out.println(res);
    }
    public static boolean palindrome(int n) {
        int temp = n;
        int rev = 0;
        while(n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if(temp == rev) {
                return true;
        }
        else {
            return false;
        }
    }
}
