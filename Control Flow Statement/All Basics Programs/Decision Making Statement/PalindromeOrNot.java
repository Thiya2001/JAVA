import java.util.Scanner;
public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int temp = n, rev = 0;

        while(n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println(temp == rev ? "Yes it is Palindrome" : "No it is Not Palindrome");
    }
}
