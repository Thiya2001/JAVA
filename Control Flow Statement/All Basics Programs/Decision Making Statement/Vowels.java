import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter : ");
        char letter = sc.next().charAt(0);
        switch (letter) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println(letter + " is a vowels.");
                break;
                default:
                System.out.println(letter + " is a Consonant.");
        }
    }
}
