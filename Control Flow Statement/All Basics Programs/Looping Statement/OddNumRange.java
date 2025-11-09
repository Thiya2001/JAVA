import java.util.Scanner;
public class OddNumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int s = 0;
        for(int i=1;i<=n;i++) {
            if(i % 2 == 1) {
                s += i;
            }
        }
        System.out.println(s);
    }
}
