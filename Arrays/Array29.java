import java.util.Arrays;
public class Array29 {
    public static int[] solve(int[] a) {
        int[] res = new int[a.length];
        for(int i=0;i<a.length;i++) {
            res[i] = a[i] * a[i];
        }
        Arrays.sort(res);
        return res;
    }
    public static void main(String args[]) {
        int[] a = {-4,-1,0,3,10};
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("Square Of Sorted Array : " + Arrays.toString(solve(a)));
    }
}
