import java.util.Scanner;
public class LargeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The a Value : ");
        int a = sc.nextInt();
        System.out.print("Enter The b Value : ");
        int b = sc.nextInt();
        int res = (a > b) ? a : b;
        System.out.println(res + " is Largest Value.");
    }
}
