import java.util.Arrays;
public class Array10 {
    public static boolean isprime(int num) {
        if (num == 0 || num == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static int solve(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (isprime(a[i]))
                sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,5,6,11,8,14};
        System.out.println("A: " + Arrays.toString(a));
        int res = solve(a);
        System.out.println("Total prime sum : " + res);
    }
}
