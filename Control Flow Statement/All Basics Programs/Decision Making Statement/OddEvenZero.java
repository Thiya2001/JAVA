import java.util.Scanner;
public class OddEvenZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number : ");
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;
        int zero = 0;
        while(num > 0) {
            int digit = num%10;
            if(digit == 0) {
                zero++;
            }
            else if(digit % 2 == 0) {
                even = even + digit;
            }
            else {
                odd = odd + digit;
            }
            num = num/10;
        }
        System.out.println("Even number is : " + even);
        System.out.println("Odd number is : " + odd);
        System.out.println("Zero is : " + zero);
    }
}
