import java.util.Scanner;
public class Recursion3 {
    static Scanner sc = new Scanner(System.in);
    static int ans = 1;
    public static int findFactorial(int num) {
        if(num>=2) {
            ans*=num;
            num--;
            findFactorial(num);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int res = findFactorial(num);
        System.out.println("Result : " + res);
    }
}
