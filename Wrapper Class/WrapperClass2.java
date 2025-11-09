public class WrapperClass2 {
    public static void main(String[] args) {
        int x = 10;

        Integer obj = Integer.valueOf(x);
        System.out.println(obj);

        int res = obj.intValue();
        System.out.println(res);
    }
}
