import java.util.Scanner;
public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size : ");
        int size = sc.nextInt();
        sc.nextLine();
        String a[] = new String[size];
        //Insertion Operation
        for(int i=0;i<a.length;i++) {
            System.out.print("Enter The Element in a [" + i + "] : ");
            a[i] = sc.nextLine();
        }
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
}
