import java.util.Scanner;
public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Electricity Units : ");
        int units = sc.nextInt();
        float charge = 0.0f;

        if(units<=50) {
            charge = units * 0.50f;
        }
        else if(units<=150) {
            charge = units * 0.75f;
        }
        else if(units <= 250){
            charge = units * 1.20f;
        }
        else if(units > 250){
            charge = units * 1.50f;
        }
        charge = charge + (charge * 0.20f);
        System.out.println("Total Bill Amount : " + charge);
    }
}

