public class Demo {
    public static void main(String[] args) {
        System.out.println("Hi");
        try {
            Class.forName("Demo");
        }
        catch(ClassNotFoundException e) {
            System.out.println("Class Not Found Exception");
        }
        System.out.println("Bye");
    }
}
