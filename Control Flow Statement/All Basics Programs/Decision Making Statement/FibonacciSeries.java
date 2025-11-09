import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0 , b = 1 , c = 0;
        System.out.print("Enter The Series : ");
        int series = sc.nextInt();
        while(series >= 1) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
            series--;
        }
    }
}
