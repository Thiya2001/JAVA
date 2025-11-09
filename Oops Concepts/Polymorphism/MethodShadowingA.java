public class MethodShadowingA {
    public static void pay() {
        System.out.println("Parent Pay");
    }
}
class B extends MethodShadowingA {
    public static void pay() {
        System.out.println("Child Pay");
    }
    public static void main(String[] args) {
        pay();
        MethodShadowingA.pay();
        B ref1 = new B();
        ref1.pay();
        MethodShadowingA ref2 = new MethodShadowingA();
        ref2.pay();
        MethodShadowingA ref3 = new B();
        ref3.pay();
    }
}
