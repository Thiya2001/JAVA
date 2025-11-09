public class PostIncrement {
    public static void main(String[] args) {
        int x = 7, y = 3;
        int res = x++ + y++ + x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(res);
    }
}
