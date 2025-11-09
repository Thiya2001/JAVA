import java.util.Arrays;
public class Array11 {
    public static void main(String[] args) {
        int a[] = {10,20,30};
        int b[] = {40,50,60};
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
        int res[] = mergeShort(a,b);
        System.out.println("Merged 2 Arrays : " + Arrays.toString(res));
    }
    public static int[] mergeShort(int[] a , int[] b) {
        int x = 0;
        int y = 0;
        int res[] = new int[a.length + b.length];
        for (int i = 0; i < res.length; i++) {
            if(x < a.length)
            res[i] = a[x++];
            else if(y < b.length)
            res[i] = b[y++];
        }
        return res;
    }
}
