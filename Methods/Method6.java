import java.util.Scanner;
public class Method6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number : ");
        int c = sc.nextInt();
        int largest = findlargest(a, b, c);
            System.out.println("The Large Number is : " + largest);
        }
        public static int findlargest(int a, int b, int c) {
        if(a >= b && a >= c) {
            return a;
        }
        else if(b >= a && b >= c) {
            return b;
        }
        else {
            return c;
        }
    }
}
