import java.util.Scanner;
public class Method9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char input = sc.next().charAt(0);
        int asci = displayAsci(input);
        System.out.println("Result : " + asci);
    }
    public static int displayAsci(char data) {
        return data;
    }
}
