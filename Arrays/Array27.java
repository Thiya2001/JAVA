import java.util.Arrays;
public class Array27 {
    public static int[] solve(int[] a, int n) {
        for(int k=1;k<=n;k++) {
            int first = a[0];
            for(int i=1;i<a.length;i++) {
                a[i - 1] = a[i];
            }
            a[a.length - 1] = first;
        }
        return a;
    }
    public static void main(String args[]) {
        int[] a = {10,20,30,40,50};
        System.out.println("a : " + Arrays.toString(a));
        int[] res = solve(a,3);
        System.out.println("Left Rotation : " + Arrays.toString(res));
    }
}
