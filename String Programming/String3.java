//Read The String
import java.util.Scanner;
public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("My Name is " + name);
        System.out.print("Enter Any Sentence : ");
        String sen = sc.next();
        System.out.println("Sentence is : " + sen);
    }
}
