public class Arithematic1 {
    public static void main(String[] args) {
        System.out.println("Addition :");
        double wallet = 3000;
        System.out.println("Initial Balance : " + wallet);
        double cashback = 250;
        System.out.println("Received Cashback : " + cashback + " RS");
        wallet = wallet + cashback;
        System.out.println("Available Balance : " + wallet);
    }
}
