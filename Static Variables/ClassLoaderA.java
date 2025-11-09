public class ClassLoaderA {
    static {
        System.out.println("Hi I am static multi-line initilizer one from A");
    }
    static double pi = 3.14;
    public static void main(String[]args) {
        System.out.println("Hello from A");
    }
    static {
        System.out.println("Hi I am static multi-line initilizer two from A");
    }
}
