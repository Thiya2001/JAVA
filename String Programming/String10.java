//Check Anagram or not
import java.util.*;
public class String10 {
    public static boolean isAnagram(String s1,String s2) {
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String 1 : ");
        String s1 = sc.nextLine();
        System.out.print("Enter The String 2 : ");
        String s2 = sc.nextLine();
        if(isAnagram(s1,s2))
        System.out.println(s1 + ", " + s2 + " is Anagram.");
        else
        System.out.println(s1 + ", " + s2 + " is Not Anagram.");
    }
}
