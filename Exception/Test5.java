public class Test5 {
    public static void main(String[] args) {
        System.out.println("hi");
        try {
            System.out.println(10/0);
            System.out.println("Try Block");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide number by Zero");
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Bye");
    }
}
