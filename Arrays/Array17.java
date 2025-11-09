import java.util.Arrays;
public class Array17 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40};
        int b[] = {50,60,70,80};
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
        int res[] = mergeRev(a,b);
        System.out.println("Merged Arrays for 2nd Array Reverse : " + Arrays.toString(res));
    }
    public static int[] mergeRev(int[] a, int[] b) {
        int x = 0;
        int y = b.length-1;
        int res[] = new int[a.length + b.length];
        for(int i=0;i<res.length;i++) {
            if(x < a.length)
            res[i] = a[x++];
            else if(y >= 0)
            res[i] = b[y--];
        }
        return res;
    }
}
