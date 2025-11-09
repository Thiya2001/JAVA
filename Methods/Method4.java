import java.util.Scanner;
class method4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start");
        System.out.print("Enter the any character : ");
        char user = sc.next().charAt(0);
        String res = checkcharacter(user);
        System.out.println("Result : " + res);
        System.out.println("End");
        return;
    }
    public static String checkcharacter(char data) {
        if(data >= 'A' && data <= 'Z' || data >= 'a' && data <= 'z') {
            return "Letter";
        }
        else if(data >= '0' && data <= '9') {
            return "Number";
        }
        else {
            return "Special Character";
        }
    }
}