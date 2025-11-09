import java.util.Scanner;
public class CountTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number : ");
        int num = sc.nextInt();
        int count = 0;
        while(num > 0) {
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
