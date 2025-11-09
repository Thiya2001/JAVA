import java.util.Scanner;
public class User1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter your weight : ");
        double weight = sc.nextDouble();

        System.out.println("User age is : "+ age);
        System.out.println("User Weight is : " + weight);
    }
}