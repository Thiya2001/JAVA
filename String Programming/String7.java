// Check String is Palindrome or not
import java.util.Scanner;
public class String7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String to check palindrome : ");
        String str = sc.nextLine();
        if(isPalindrome(str))
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }
    public static boolean isPalindrome(String str) {
        String rev = "";
        for(int i=str.length()-1;i>=0;i--) {
            rev = rev + str.charAt(i);
        }
        return rev.equals(str);
        // return rev.equalsIgnoreCase(str);
    }
}
