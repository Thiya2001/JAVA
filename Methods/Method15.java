import java.util.Scanner;
public class Method15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Name : ");
        String s = sc.nextLine();
        System.out.print("Enter the age : ");
        int a = sc.nextInt();
        System.out.println("Hello " + s + " you are " + a + " years old.");
    }
    public static String display(String s) {
        return s;
    }
    public static int display(int a) {
        return a;
    }
}
