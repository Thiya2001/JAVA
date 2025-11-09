public class ClassLoader2 {
    static {
        int a = 30;
        System.out.println("JavaScript : " + a);
        System.out.println("Java : " + ClassLoader2.a);
    }
    static boolean a = true;
    static String b = "Java";
    static {
        System.out.println(b);
        System.out.println(ClassLoader2.b);
    }
    public static void main(String[] args) {
        System.out.println("Hi from main");
        solve();
        System.out.println("Bye from main");
    }
    public static void solve() {
        System.out.println("Solving");
    }
    {
        System.out.println("Python");
    }
}
