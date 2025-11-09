import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number : ");
        int mul = sc.nextInt();
        int n = 16;
        int c;
        for(int i=1;i<=n;i++) {
            c = mul * i;
            System.out.println(i + " x " + mul + " = " + c);
        }
    }
}
