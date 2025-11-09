interface P {
    public static void dance() {
        System.out.println("Classical");
    }
}
interface Q {
    public static void dance() {
        System.out.println("Folk");
    }
}
class R implements P, Q {
    public static void main(String[] args) {
        P.dance();
        Q.dance();
    }
}