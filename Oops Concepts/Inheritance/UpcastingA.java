public class UpcastingA {
    int x = 10;
    public void m1() {
        System.out.println("Parent");
    }
}
class B extends UpcastingA {
    int y = 20;
    public void m2() {
        System.out.println("Child");
    }
    public static void main(String[] args) {
        UpcastingA ref = new B();
        System.out.println(ref.x);
        ref.m1();
        B childRef = new B();
        System.out.println(childRef.y);
        childRef.m2();
    }
}
