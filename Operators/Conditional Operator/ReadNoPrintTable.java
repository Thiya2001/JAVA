import java.util.Scanner;
public class ReadNoPrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number : ");
        int num = sc.nextInt();
        for(int i=1;i<=16;i++) {
            System.out.println(num + " X " + i + " = " + i * num);
        }
    }
}
