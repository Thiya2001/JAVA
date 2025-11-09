import java.util.Scanner;
public class StrongNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int last , ans;
        while(n > 0) {
            last = n % 10;
            ans = 1;
            for(int i=2;i<=last;i++) {
                ans *= i;
            }
            sum += ans;
            n /= 10;
        }
        if(temp == sum) {
            System.out.println("It is a Strong Number.");
        }
        else {
            System.out.println("It is Not Strong Number.");
        }
    }
}
