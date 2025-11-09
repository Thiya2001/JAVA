public class MultiLevel {
    int a = 10;
}
class b extends MultiLevel {
    public static void time() {
        System.out.println("Boy gives time");
    }
}
class c extends b {
    public static void main(String[] args) {
        time();
        c obj = new c();
        System.out.println(obj.a);
    }
}
