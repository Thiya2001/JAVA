import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        int rn = (int)(Math.random()*100);
        int att = 0;
        System.out.println("-------Gussing Game-------");
        System.out.println("Any Guessing Number between 1 to 100");

        while(flag) {
            System.out.print("Enter your guesses : ");
            int a = sc.nextInt();
            att++;
        if(a < rn) {
            System.out.println("To low");
        }
        else if(a > rn) {
            System.out.println("To high");
        }
        else {
            System.out.println("You are Guessing number is correct totally " + att + " Attempts...");
            flag=false;
        }
    }
        System.out.println("Do you want play again! (S to continue and N to exit): ");
        char s = sc.next().charAt(0);
        if(s=='s'||s=='S'){
            main(null);
        }
        else if(s=='n'||s=='N'){
            System.out.println("Thanking you for playing.");
        }
        else{
            System.out.println("Exit for the game...");
        }
    }
}

