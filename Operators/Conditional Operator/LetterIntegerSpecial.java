import java.util.Scanner;
public class LetterIntegerSpecial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char data = sc.next().charAt(0);
        if(data>='A' && data<='Z' || data>='a' && data<='z') {
            System.out.println("Letter.");
        }
        if(data>='0' && data<='9') {
            System.out.println("Number.");
        }
        else {
            System.out.println("Special Character.");
        }
    }
}
