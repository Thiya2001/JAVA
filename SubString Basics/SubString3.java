import java.util.Scanner;
public class SubString3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String s = sc.nextLine();
        System.out.println(reverseString(s));
    }
    public static String reverseString(String s) {
        String ans[] = s.split(" ");
        String temp = "";
        for(int i=ans.length-1;i>=0;i--) {
            temp += ans[i] + " "; //This is used to space in the String
        }
        return temp;
    }
}
