public class ClassLoader1 {
    static boolean a = true;
    {
        System.out.println("Hi I am non-static multi line initilizer");
    }
    int b = 20;
    public void solve() {
        System.out.println("Solving");
    }
    public static void main(String[] args) {
        System.out.println("Hi from main");
        System.out.println(a);
        System.out.println(d);
        System.out.println("Bye from main");
    }
    static double d = 2.3;
    static {
        System.out.println("Hi I am static multi-line initilizer");
    }
}
