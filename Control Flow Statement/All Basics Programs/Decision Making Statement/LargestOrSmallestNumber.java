import java.util.Scanner;
public class LargestOrSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        boolean flag = true;

        do {
            System.out.print("Enter Number : ");
            int n = sc.nextInt();
            large = Math.max(n , large);
            small = Math.min(n , small);
            System.out.print("Enter Y to continue and N to Stop : ");
            char user = sc.next().charAt(0);
            if(user == 'y' || user == 'Y') {
            flag = true;
            }
            else if(user == 'n' || user == 'N') {
            flag = false;
            }
        }
        while (flag);
            System.out.println("1st Largest : " + large);
            System.out.println("1st Smallest : " + small);
    }
}
