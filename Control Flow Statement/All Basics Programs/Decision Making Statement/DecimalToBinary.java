public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 13;
        String ans = "";
        while(n > 0) {
            ans = n % 2 + ans;
            n /= 2;
        }
        System.out.println(ans);
    }
}
