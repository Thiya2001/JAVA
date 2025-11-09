public class HelperMethod {
    public static void main(String[] args) {
        Helper h = new Helper();
        System.out.println(h.trainer);
        System.out.println(h.tracker1());
        h.tracker2("Asus");
        System.out.println(h.tracker1());
    }
}
