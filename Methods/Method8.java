import java.util.Scanner;
public class Method8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int res = findFactorial(n);
        System.out.println("Result : " + res);

    }
    public static int findFactorial(int n) {
        int ans = 1;
        for(int i = 2;i<=n;i++) {
            ans*=i;
        }
        return ans;
    }
}
