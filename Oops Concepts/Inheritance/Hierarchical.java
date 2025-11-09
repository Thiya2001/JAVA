public class Hierarchical {
    static int m = 1000;
    public static void time() {
        System.out.println("Moddy has time");
    }
}
class B extends Hierarchical {
    public static void main(String[] args) {
        System.out.println("Girl Friend 1");
        time();
    }
}
class C extends Hierarchical {
    public static void main(String[] args) {
        System.out.println("Girl Friend 2");
        time();
    }
}
