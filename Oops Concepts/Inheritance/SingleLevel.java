public class SingleLevel {
    public static void payBill() {
        System.out.println("Boy friend will pay the Bill");
    }
}
class B extends SingleLevel {
    public static void shopping() {
        System.out.println("Girl friend will do shopping");
    }
    public static void main(String[] args) {
        shopping();
        payBill();
    }
}
