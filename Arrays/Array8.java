import java.util.Arrays;
public class Array8 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        System.out.println("a : " + Arrays.toString(a));
        int res = solve(a);
        System.out.println("Total Sum : " + res);
    }
    public static int solve(int[]a) {
        int sum = 0;
        for(int i=0;i<a.length;i++) {
            sum += a[i];
        }
        return sum;
    }
}
