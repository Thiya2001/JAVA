import java.util.Scanner;
public class User2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stud id : ");
        int id = sc.nextInt();
        System.out.print("Enter stud marks : ");
        int mark = sc.nextInt();
        System.out.print("Enter stud contact : ");
        long contact = sc.nextLong();
        System.out.print("Enter stud percentage : ");
        double percentage = sc.nextDouble();
        System.out.print("Enter stud name first letter : ");
        char fl = sc.next().charAt(0);

        System.out.println("Stud id is : "+ id);
        System.out.println("Stud marks is : " + mark);
        System.out.println("Stud Contact number is : " + contact);
        System.out.println("Stud percentage is : " + percentage);
        System.out.println("Stud name first letter is : " + fl);
    }
}