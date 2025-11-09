import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        String res = (a>0) ? "Positive Number" : "Negative Number";
        System.out.println(res);
    }
}
