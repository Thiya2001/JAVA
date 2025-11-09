import java.util.Scanner;
public class User3 {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter emp id : ");
        int id = sc.nextInt();
        System.out.print("Enter emp salary : ");
        double sal = sc.nextDouble();
        System.out.print("Enter emp contact : ");
        long contact = sc.nextLong();
        System.out.print("Enter The Years of experiance : ");
        double experiance = sc.nextDouble();
        System.out.print("Enter stud name first letter : ");
        char ln = sc.next().charAt(0);
        System.out.println("------------------------------------");

        System.out.println("Emp id is : "+ id);
        Thread.sleep(1000);
        System.out.println("Emp salary is : " + sal);
        Thread.sleep(1000);
        System.out.println("Emp contact number is : " + contact);
        Thread.sleep(1000);
        System.out.println("Emp experiance is : " + experiance);
        Thread.sleep(1000);
        System.out.println("Emp last name is : " + ln);
        Thread.sleep(1000);
    }
}