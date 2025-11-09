//Compare String same or not
import java.util.Scanner;
public class String4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Favorite Food 1 : ");
        String food1 = sc.nextLine();
        System.out.print("Enter Your Favorite Food 2 : ");
        String food2 = sc.nextLine();
        System.out.println(food1 == food2);
        System.out.println(food1.equals(food2));
    }
}
