import java.util.Scanner;
class InvalidAgeException extends RuntimeException {
    @Override
    public String getMessage() {
        return "You are not eligible for vote";
    }
}

public class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("Ready to vote");
        }
        else {
            try {
                throw new InvalidAgeException();
            }
            catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Bye");
    }
}