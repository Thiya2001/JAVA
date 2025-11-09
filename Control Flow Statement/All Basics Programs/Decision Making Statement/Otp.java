import java.util.Scanner;

public class Otp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int sys_otp = 100000 + (int)(Math.random()*900000);
        System.out.println("Sending otp to your registered mobile number...");
            Thread.sleep(3000);
            System.out.println(sys_otp);
            System.out.println("Enter the otp : ");
            int user_otp = sc.nextInt();
            String msg = ((sys_otp == user_otp) ? "verification success." : "verification failed.");
                System.out.println(msg);
    }
}
