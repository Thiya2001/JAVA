import java.util.Arrays;
public class Array18 {
    public static int[] productExceptionSelf(int[] a) {
        int n = a.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        int[] res = new int[n];
        pre[0] = 1;
        suf[n-1] = 1;
        for(int i=1;i<n;i++) {
            pre[i] = a[i-1] * pre[i-1];
        }
        for(int i=n-2;i>=0;i--) {
            suf[i] = a[i+1] * suf[i+1];
        }
        for(int i=0;i<n;i++) {
            res[i] = pre[i] * suf[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[]a = {1,2,3,4};
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("Product Except Self : " + Arrays.toString(productExceptionSelf(a)));
    }
}
