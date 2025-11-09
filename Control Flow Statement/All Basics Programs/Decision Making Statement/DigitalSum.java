import java.util.Scanner;
public class DigitalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number : ");
        int num = sc.nextInt();
        int count = 0;
        while(num > 0) {
            int digit = num%10;
            count = count + digit;
            num = num/10;
        }
        System.out.println("Digital sum is : " + count);
    }
}
