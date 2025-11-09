public class MainClass3 {
    public static void main(String[] args) {
        System.out.println("Hi");
        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Bye");
    }
}
