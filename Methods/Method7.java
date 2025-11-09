import java.util.Scanner;

public class Method7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.println("\nSelect The Operation :");
            System.out.println("------------------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");
            System.out.print("Enter your choice : ");
            int input = sc.nextInt();

            if (input >= 1 && input <= 3) {
                System.out.print("Enter a : ");
                int a = sc.nextInt();
                System.out.print("Enter b : ");
                int b = sc.nextInt();

                switch (input) {
                    case 1:
                        System.out.println("Addition Result : " + add(a, b));
                        break;
                    case 2:
                        System.out.println("Subtraction Result : " + sub(a, b));
                        break;
                    case 3:
                        System.out.println("Multiplication Result : " + mul(a, b));
                        break;
                }
            } else if (input == 4) {
                flag = false;
            } else {
                System.out.println("Invalid input. Please select from 1 to 4.");
            }
        } while (flag);

        System.out.println("Thank you.");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }
}
