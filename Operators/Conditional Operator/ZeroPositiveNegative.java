import java.util.Scanner;
public class ZeroPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input : ");
        String zpn = sc.next();
        String res = zpn.matches("-?\\d+") ? (Integer.parseInt(zpn) == 0 ? "Zero" : (Integer.parseInt(zpn) > 0 ? "Positive." : "Negative.")) : "Invalid input.";
        System.out.println("Number is : " + res);
    }
}
