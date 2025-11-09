import java.util.Scanner;
public class Method14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number : ");
        int a = sc.nextInt();
        String s = checkWhetherNum(a);
        System.out.println(s);
    }
    public static String checkWhetherNum(int a) {
        if(a % 2 == 0) {
            return a + " is Even Number";
        }
        else {
            return a + " is Odd Number";
        }
    }
}
