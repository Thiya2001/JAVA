public class Arithematic2 {
    public static void main(String[] args) {
        System.out.println("Subtraction : ");
        double wallet = 3000;
        System.out.println("Initial Balance : "+wallet);
        double spent = 50;
        System.out.println("Amount Spent : "+ spent +" RS");
        wallet = wallet - spent;
        System.out.println("Available Balance : "+wallet);
    }
}
