import java.util.Scanner;
class method18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any character : ");
        char user = sc.next().charAt(0);
        String res = checkVowels(user);
        System.out.println("Result : " + res);
        return;
    }
    public static String checkVowels(char data) {
        if(data >= 'A' && data <='Z' || data >= 'a' && data <= 'z'){
            if(data == 'A' || data == 'E' || data == 'I' || data == 'O' || data =='U' || data == 'a' || data == 'e' || data == 'i' || data == 'o' || data =='u') {
                return "Vowels";
            }
            else {
                return "Not Vowels";
            }
        }
        else if(data >= '0' && data <= '9') {
            return "Number";
        }
        else {
            return "Special Character";
        }
    }
}