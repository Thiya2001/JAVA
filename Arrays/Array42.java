import java.util.Arrays;
public class Array42 {
    public static boolean validMountain(int[] a) {
        if(a.length < 3) {
            return false;
        }
        int i = 0;
        while(i < a.length - 1 && a[i] < a[i + 1]) {
            i++;
        }
        if(i == 0 || i == a.length - 1) {
        return false;
        }
        while(i < a.length - 1 && a[i] > a[i + 1]) {
            i++;
        }
        return (i == a.length - 1);
    }
    public static void main(String[] args) {
        int a[] = {0,2,3,4,5,2,1,0};
        System.out.println(Arrays.toString(a));
        boolean res = validMountain(a);
        System.out.println(res);
    }
}
