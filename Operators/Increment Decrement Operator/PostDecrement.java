public class PostDecrement {
    public static void main(String[] args) {
        int p = 8, q = 4;
        int res = p-- + q-- - p;

        System.out.println(p);
        System.out.println(q);
        System.out.println(res);
    }
}
