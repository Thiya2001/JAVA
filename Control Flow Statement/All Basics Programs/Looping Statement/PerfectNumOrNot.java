import java.util.Scanner;
public class PerfectNumOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n/2;i++) {
            if(n % i == 0) {
                sum = sum + i;
                System.out.println(i + " ");
            }
        }
        if(sum == n){
            System.out.println("Perfect " + sum);
        }
        else {
            System.out.println("Not Perfect");
        }
    }
}
