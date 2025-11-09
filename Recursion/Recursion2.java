import java.util.Scanner;
public class Recursion2 {
    static Scanner sc = new Scanner(System.in);
    static int number;
    public static void printTables(int number, int i) {
        if(i<=10) {
            System.out.println(number + " X " + i + " = " + (number*i));
            i++;
            printTables(number, i);
        }
        return;
    }
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int number = sc.nextInt();
        printTables(number, 1);
    }
}
