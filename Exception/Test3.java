public class Test3 {
    static void m1() throws ClassNotFoundException {
        Class.forName("com.Test3");
    }
    public static void main(String[] args) {
        System.err.println("Hi");
        try {
            m1();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Bye");
    }
}
