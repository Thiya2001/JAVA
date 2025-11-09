import java.util.Arrays;
public class Array31 {
    public static int[] solve(int[] a) {
        int n = a.length;
        for(int i=0;i<n;i++) {
            if(a[i] == 0) {
                for(int j=n-1;j>i;j--) {
                    a[j] = a[j - 1];
                }
                if(i + 1 < n) {
                    a[i + 1] = 0;
                    i++;
                }
            }
        }
        return a;
    }
    public static void main(String args[]) {
        int[] a = {1,0,2,3,0,4,5,0};
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("Duplicate Zeros : " + Arrays.toString(solve(a)));
    }
}
