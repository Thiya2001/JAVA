import java.util.Scanner;
public class Method5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number = sc.nextInt();
        if(isprime(number)) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not a Prime");
        }
    }
    public static boolean isprime(int number) {
        if(number == 1 || number == 0) {
            return false;
        }
        for(int i=2;i<number;i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
