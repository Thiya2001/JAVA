import java.util.Scanner;
public class FibonacciEvenTermed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0 , b = 1 , c = 0 , sum = 0;
        System.out.print("Enter The Series : ");
        int series = sc.nextInt();
        while(series >= 1) {
            if(c % 2 == 0) {
                sum += c;
            }
            a = b;
            b = c;
            c = a + b;
            series--;
        }
        System.out.println(sum);
    }
}
