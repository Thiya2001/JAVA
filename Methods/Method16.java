import java.util.Scanner;
public class Method16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = sc.nextInt();
        int res = sumOfEvenNum(n);
        System.out.println(res);
    }
    public static int sumOfEvenNum(int n) {
        int a = 0;
        for(int i=2;i<=n;i++) {
            if(i % 2 == 0) {
                a += i;
            }
        }
        return a;
    }
}
