import java.util.Scanner;
public class LetterNumberSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character : ");
        String ch = sc.next();
        String res = (ch.length() != 1) ? "Invalid Character."
        : Character.isLetter(ch.charAt(0)) ? "Letter."
        : Character.isDigit(ch.charAt(0)) ? "Number."
        : "Special Character.";
        System.out.println("This Character is : " + res);
    }
}
