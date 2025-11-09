import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        String ly = sc.next();
        String res = ly.matches("\\d+") ? (Integer.parseInt(ly) % 4 == 0 ? (Integer.parseInt(ly) % 100 == 0 ? (Integer.parseInt(ly) % 400 == 0 ? "Leap year." : "Not a leap year.") : "Leap year.") : "Not a leap year.") : "Invalid value";
        System.out.println("This year is : " + res);
    }
}
