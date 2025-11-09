public class BinaryToDecimal {
    public static void main(String[] args) {
        int n = 1101, sum = 0, x = 1;
        while(n > 0) {
            sum += n % 10 * x;
            n /= 10;
            x *= 2;
        }
        System.out.println(sum);
    }
}
