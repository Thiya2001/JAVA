import java.util.Scanner;

public class Skills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the skills : ");
        String skill = sc.nextLine();
        switch (skill) {
            case "Java" : System.out.println("1.Oops");
            System.out.println("2.central flow state");
            break;
            case "SQL" : System.out.println("1.DML");
            System.out.println("2.DDL");
            break;
                default:
                System.out.println("Invalid Please Enter Correct String.");
        }
    }
}
