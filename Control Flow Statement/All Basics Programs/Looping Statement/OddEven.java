import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        String res = (a%2==0) ? "Even Number" : "Odd Number";
        System.out.println(res);
    }
}
