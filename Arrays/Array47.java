import java.util.Arrays;
public class Array47 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {6,7};
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
        int res[] = mergeArray(a,b);
        System.out.println("Merged Arrays : " + Arrays.toString(res));
    }
    public static int[] mergeArray(int[] a, int[] b) {
        int res[] = new int[a.length + b.length];
        int x = 0;
        int y = 0;
        for(int i=0;i<res.length;i++) {
            if(i % 2 == 0)
            res[i] = a[x++];
            else if(i % 2 != 0)
            {
                if(b.length > y){
                res[i] = b[y];
                y++;
            }
                else
                res[i] = a[x++];
            }
        }
        return res;
    }
}
