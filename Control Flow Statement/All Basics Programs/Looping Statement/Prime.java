import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        boolean is_prime = true;
        if(n!=1 && n!=0) {
            for(int i=2;i<n;i++) {
                if(n%i==0) {
                    is_prime = false;
                    break;
                }
            }
            System.out.println(is_prime ? "Prime" : "Not Prime");
        }
        else
        {
        System.out.println("Not Prime");
        }
    }
}
