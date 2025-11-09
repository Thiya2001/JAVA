public class DownCastingA {
    int a = 10;
    public void m1() {
        System.out.println("Parent");
    }
}
class B extends DownCastingA {
    int b = 20;
    public void m2() {
        System.out.println("Child");
    }
    public static void main(String[] args) {
        DownCastingA ref = new B();
        System.out.println(ref.a);
        ref.m1();
        B obj = (B) ref;
        System.out.println(obj.a);
        obj.m1();
        System.out.println(obj.b);
        obj.m2();
    }
}
