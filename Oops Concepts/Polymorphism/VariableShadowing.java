public class VariableShadowing {
    static int a = 10;
    int b = 20;
}
class B extends VariableShadowing {
    static int a = 30;
    int b = 40;
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(VariableShadowing.a);

        B ref1 = new B();
        System.out.println(ref1.b);

        VariableShadowing ref2 = new VariableShadowing();
        System.out.println(ref2.b);

        VariableShadowing ref3 = new B();
        System.out.println(ref3.b);
        System.out.println(ref3.a);
    }
}
