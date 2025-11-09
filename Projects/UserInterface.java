import java.util.Scanner;

public class UserInterface {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Bag bag = new Bag();
        boolean menu = true;
        do {
            System.out.println("\tMenu");
            System.out.println("1.Add the ball \n2.Remove the ball \n3.Check the ball is empty or not \n4.Show the game \n5.Exit");
            System.out.print("Enter Your Choice : ");
            int Choice = sc.nextInt();

            switch (Choice) {
                case 1: System.out.println("Press a for BasketBall \nPress b for Tennis \nPress c for Cricket");
                System.out.print("Select the game : ");
                char input = sc.next().charAt(0);
                switch (input) {
                    case 'a': bag.addBall(new BasketBall(20));
                        break;
                    case 'b': bag.addBall(new Tennis(5));
                        break;
                    case 'c': bag.addBall(new Cricket(6));
                        break;
                    default: System.out.println("Invalid Game");
                    break;
                }
                break;
                case 2: bag.removeBall();
                break;
                case 3: System.out.println(bag.isBagEmpty() ? "Bag is Empty" : "Bag is not Empty");
                break;
                case 4: bag.showGame();
                break;
                case 5: menu = false;
                break;
                default: System.out.println("Invalid Choice.");
                break;
            }
        }
        while (menu);
    }
}