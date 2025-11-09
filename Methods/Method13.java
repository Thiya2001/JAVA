import java.util.Scanner;
public class Method13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        System.out.print("Enter Third number : ");
        int c = sc.nextInt();
        int res =  largestOfThreeNumber(a, b, c);
        System.out.println("The Largest Number is : " + res);
        return;
    }
    public static int largestOfThreeNumber(int a, int b, int c) {
        if(a >= b && a >= c) {
            return a;
        }
        else if(b >= a && b >= c){
            return b;
        }
        else {
            return c;
        }
    }
}

