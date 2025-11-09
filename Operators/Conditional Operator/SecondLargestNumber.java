import java.util.Scanner;
public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers...");
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2st number : ");
        int b = sc.nextInt();
        System.out.println("Enter 3st number : ");
        int c = sc.nextInt();
        int second;
        if((a>b && a<c) || (a<b && a>c)) {
            second = a;
        }
        else if((b>a && b<c) || (b<a && b>c)) {
            second = b;
        }
        else {
            second = c;
        }
        System.out.println("Second largest number is : " + second);
    }
}