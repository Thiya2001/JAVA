public class Logical {
    public static void main(String[] args) {
        System.out.println(5 > 3 && 2 < 1);
        System.out.println(5 > 3 || 2 < 1);
        System.out.println((2 > 1 || 3 < 1) && (false && true));
        boolean res = !true;
        System.out.println(res);
    }
}
