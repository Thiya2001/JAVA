import java.util.Scanner;
public class Array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        //Insertion Operation
        for(int i=0;i<a.length;i++) {
            System.out.print("Enter The Element in a [" + i + "] : ");
            a[i] = sc.nextInt();
        }
        System.out.println("----------------------------------------");
        for(int i=0;i<a.length;i++) {
            if(a[i] % 2 == 0) {
            System.out.print(a[i] + " ");
            }
        }
    }
}
