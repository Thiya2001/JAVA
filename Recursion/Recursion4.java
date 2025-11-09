import java.util.Scanner;
public class Recursion4 {
    static Scanner sc = new Scanner(System.in);
    static int n1 = 1, n2 = 1, n3;
    public static void fibo(int series) {
        if(series>=1) {
            System.out.println(n3 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            series--;
            fibo(series);
        }
        return;
    }
    public static void main(String[] args) {
        System.out.print("Enter The Number Of Series : ");
        int s = sc.nextInt();
        fibo(s);
    }
}
