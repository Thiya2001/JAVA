import java.util.Scanner;
public class Percentages {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage : ");
        double d = sc.nextDouble();
        String res = d>100 || d<0 ? "Invalid" : d>=80 ? "A" : d>=60 ? "B" : d>=35 ? "C" : "Fail";
        System.out.println("Processing...");
        Thread.sleep(1000);
        System.out.println("Your grade is : "+res);
    }
}
