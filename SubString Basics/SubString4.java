import java.util.Scanner;
public class SubString4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String s = sc.nextLine();
        System.out.println(isSolve(s));
    }
    public static String isSolve(String s) {
        String ans[] = s.split(" ");
        String temp = "";
        for(int i=ans.length-1;i>=0;i--) {
            String word = ans[i];
            String revword = "";
            if(i % 2 != 0){
            for(int j=word.length()-1;j>=0;j--) {
                revword += word.charAt(j);
            }
            temp += revword + " ";
            }
            else
            temp += ans[i] + " ";
        }
        return temp;
    }
}
