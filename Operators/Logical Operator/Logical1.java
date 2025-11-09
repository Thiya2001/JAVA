public class Logical1 {
    public static void main(String[] args) {
        int a = 12, b = 38, c = 23;
        boolean r1 = a>b && c<b;
        boolean r2 = c>a || b<a;
        boolean r3 = b>84 || 39<a && c<b;
        boolean r4 = !r3;
        boolean r5 = !(!(78<3 && 4>4) || true);
        boolean r6 = !(!true && !true);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
    }
}
