public class PreDecrement {
    public static void main(String[] args) {
        int m = 12, n = 6;
        int result = --m - --n + m;

        System.out.println(m);
        System.out.println(n);
        System.out.println(result);
    }
}
