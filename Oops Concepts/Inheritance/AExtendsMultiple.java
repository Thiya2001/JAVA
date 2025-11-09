public class AExtendsMultiple {
    static int x =10;
    public static void display() {
        System.out.println("Display");
    }
}
class B extends AExtendsMultiple {
    static int y = 20;
    public static void print() {
        System.out.println("Print");
    }
}
class c extends B {
    static int z = 30;
    public static void solve() {
        System.out.println("Solve");
    }
    public static void main(String[] args) {
        System.out.println(z);
        System.out.println(y);
        System.out.println(x);
        solve();
        print();
        solve();
        display();
    }
}