import java.util.Scanner;
class method11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number = sc.nextInt();
        int res = getSquare(number);
        System.out.println("Result : " + res);
        return;
    }
    public static int getSquare(int number) {
        return(number*number);
    }
}