import java.util.Scanner;
public class PrimeOrComposite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int count=0;
        for(int j=1;j<=n;j++)
        {
            if(n%j==0)
            {
            count++;
            }
        }
            if(count==2)
            {
            System.out.println(n + " is a Prime number.");
            }
        else
        {
        System.out.println(n + " is a Composite number.");
        }
    }
}
