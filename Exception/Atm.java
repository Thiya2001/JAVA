import java.util.Scanner;
class InsufficientBalanceException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Amount is Insufficient";
    }
}
public class Atm {
    public static void main(String[] args) {
        double balance = 5000.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw less than 5000 : ");
        double amount = sc.nextDouble();
        System.out.println("Withdrawing Amount : " + amount);
        if(amount <= balance) {
            balance = balance - amount;
            System.out.println("Balance Amount is : " + balance);
        }
        else {
            try {
                throw new InsufficientBalanceException();
            }
            catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Thank you");
    }
}
