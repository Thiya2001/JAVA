import java.util.Scanner;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number = sc.nextInt();
        boolean ps = false;
        for(int i=1;i*i<=number;i++) {
            if(i * i == number) {
                ps = true;
                break;
            }
        }
        if(ps) {
            System.out.println(number + " is a Perfect Square.");
        }
        else {
            System.out.println(number + " is not a Perfect Square.");
        }
    }
}
