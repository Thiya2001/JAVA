    import java.util.Scanner;
public class EnglishAlphabetsLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The No Of Rows : ");
        int rows = sc.nextInt();
        for(int i=1; i<=rows; i++) {
            System.out.print("i : " + i + " = ");
            for(char j='A';j<='Z';j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}