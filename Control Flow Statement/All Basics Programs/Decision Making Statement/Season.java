import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 - 5 : Summer");
        System.out.println("Enter 6 - 8 : Winter");
        System.out.println("Enter 9 - 12 : Rainy");
        System.out.print("Enter the month : ");

        int a = sc.nextInt();

        if(a >= 1 && a <= 5) {
            System.out.println("Summer");
        }
        else if(a >= 6 && a <= 8) {
            System.out.println("Winter");
        }
        else if(a >= 9 && a <= 12) {
            System.out.println("Rainy");
        }
    }
}
