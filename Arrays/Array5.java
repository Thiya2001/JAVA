import java.util.Scanner;
public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size : ");
        int size = sc.nextInt();
        char a[] = new char[size];
        //Insertion Operation
        for(int i=0;i<a.length;i++) {
            System.out.print("Enter The Element in a [" + i + "] : ");
            a[i] = sc.next().charAt(0);
        }
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
}
