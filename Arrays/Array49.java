import java.util.Arrays;
public class Array49 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {6, 7, 8, 9, 10};

        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
        System.out.println("res : " + Arrays.toString(zigZag(a, b)));
    }
    public static int[] zigZag(int[] a, int[] b) {
        int res[] = new int[a.length + b.length];
        for(int i=0,x=0,y=0;i<res.length;i++) {
            if(i % 2 == 0)
            res[i] = a[x++];
            else
            res[i] = b[y++];
        }
        return res;
    }
}
