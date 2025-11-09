import java.util.Scanner;

public class Food {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter food name : ");
        String food = sc.nextLine();
        switch (food) {
            case "Idli" , "idli" : System.out.println("Idli : " + 5 + " Rs.");
            break;
            case "Dosa" , "dosa" : System.out.println("Dosa : " + 8 + " Rs.");
            break;
            case "Poori" , "poori" : System.out.println("Poori : " + 10 + " Rs.");
            break;
                default:
                System.out.println("Dish is not Available.");
        }
    }
}
