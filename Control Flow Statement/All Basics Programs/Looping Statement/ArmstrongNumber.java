import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
            while(num > 0) {
                int digit = num % 10;
                sum += digit*digit*digit;
                num /= 10;
            }
            if(temp == sum) {
                System.out.println("It is a Armstrong Number.");
            }
            else {
                System.out.println("It is a Not Armstrong Number.");
        }
    }
}
