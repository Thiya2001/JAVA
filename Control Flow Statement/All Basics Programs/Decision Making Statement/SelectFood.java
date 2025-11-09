import java.util.Scanner;
public class SelectFood {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Idli\n2.Pongal\n3.vada\n4.poori");
        System.out.print("Select your food : ");
        int a = sc.nextInt();
        System.out.println("Processing...");
        Thread.sleep(1000);
        if(a==1) {
            System.out.println("Idli : 50Rs");
        }
        else if(a==2) {
            System.out.println("Pongal : 80Rs");
        }
        else if(a==3) {
            System.out.println("Vada : 20Rs");
        }
        else {
            System.out.println("Poori : 40Rs");
        }
    }
}
