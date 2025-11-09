public class PreIncrement {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int result = ++a + ++b + a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(result);
    }
}
