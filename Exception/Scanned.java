import java.util.Scanner;
class ScannerException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Already Scanned";
    }
}
public class Scanned {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items to scan : ");
        boolean Scanner1 = sc.nextBoolean();
        if(Scanner1 == true) {
            try {
                throw new ScannerException();
            }
            catch (ScannerException e) {
                System.out.println(e.getMessage());
            }
        }
        else {
            Scanner1 = true;
            System.out.println("Successfully Scanned");
        }
    }
}
