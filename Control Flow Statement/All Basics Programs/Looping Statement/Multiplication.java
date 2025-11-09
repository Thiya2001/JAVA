import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Start :");
        int start = sc.nextInt();
        System.out.print("Enter The End :");
        int end = sc.nextInt();
        for(int i=1; i<=10; i++) {
            for(int j=start;j<=end;j++) {
                System.out.print(j+"X"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
