import java.util.Arrays;
public class Array30 {
    public static int solve(int[] a) {
        int[] b = new int[a.length];
        int d = 0;
        for(int i=0;i<a.length;i++) {
            int count = 0;
            while(a[i] > 0) {
                a[i]/=10;
                count += 1;
            }
            b[i] = count;
        }
        for(int i=0;i<b.length;i++) {
            if(b[i]%2==0) {
                d += 1;
            }
        }
        return d;
    }
    public static void main(String args[]) {
        int[] a = {12,345,2,6,7896};
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("Even Number Digits : " + solve(a));
    }
}
