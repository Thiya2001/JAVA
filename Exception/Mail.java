import java.util.Scanner;
class InvalidEmailException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Enter valid Email Address and Password";
    }
}
class InvalidPasswordException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Incorrect Password";
    }
}
public class Mail {
    public static void main(String[] args) {
        System.out.println("Welcome to login page");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Email : ");
        String email = sc.next();
        System.out.print("Enter your Password : ");
        String password = sc.next();
        try {
            if(email.equals("thiya@gmail.com")) {
                if(password.equals("123")) {
                    System.out.println("Login Successful");
                }
                else {
                    throw new InvalidPasswordException();
                }
            }
            else {
                throw new InvalidEmailException();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
