public class Ex1 {
    public static void main(String[] args) {
        double wallet = 3000;
        System.out.println("Initial Balance : "+ wallet);
        double spent = 50;
        System.out.println("Spent for Lipstick :"+ spent);
        wallet=wallet-spent;
        System.out.println("Available Balance :"+wallet);
    }
}
