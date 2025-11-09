public class ClassLoaderB {
    static {
        System.out.println("Hi I am static multi-line initilizer one from B");
    }
    static double marks = 9.3;
    public static void main(String[] args) {
        System.out.println("Hello from B");
        System.out.println(ClassLoaderA.pi);
        System.out.println(ClassLoaderB.marks);
        System.out.println(ClassLoaderA.pi);
        System.out.println("Bye from B");
    }
    static {
        System.out.println("Hi I am static multi-line initilizer two from B");
    }
}
