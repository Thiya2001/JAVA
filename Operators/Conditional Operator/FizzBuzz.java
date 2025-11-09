import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String fb = sc.next();
        String res = fb.matches("-?\\d+")
                ? (Integer.parseInt(fb) % 3 == 0 && Integer.parseInt(fb) % 5 == 0) ? "FIZZ BUZZ."
                : (Integer.parseInt(fb) % 3 == 0) ? "FIZZ."
                : (Integer.parseInt(fb) % 5 == 0) ? "BUZZ."
                : "Not divisible by 3 or 5."
            : "Invalid input please enter a number";
        System.out.println("Print for : " + res);
    }
}