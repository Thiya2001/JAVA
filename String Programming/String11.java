//To check given String is Pangram or not
/*import java.util.Scanner;
public class String11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String s = sc.nextLine();
        if(isPangram(s))
        System.out.println("It is a Pangram.");
        else
        System.out.println("It is Not a Pangram.");
    }
    public static boolean isPangram(String s) {
        s = s.toUpperCase();
        for(char i='A';i<='Z';i++) {
            if(s.indexOf(i) == -1)
            return false;
        }
        return true;
    }
} */
public class String11 {
    public static void main(String[] args) {
        String s = "The Quick BROWN Fox Jumps ovER The LAzy DOg";
        System.out.println(isPangram(s));
    }
    public static boolean isPangram(String s) {
        s = s.toUpperCase();
        char[] a = s.toCharArray();
        boolean b[] = new boolean[26];
        for(int i=0;i<a.length;i++) {
            if(a[i] != ' ')
            b[a[i] - 65] = true;
        }
        for(int i=0;i<b.length;i++) {
            if(b[i] == false)
            return false;
        }
        return true;
    }
}
