import java.util.Arrays;
public class Array33 {
    public static void main(String[] args) {
        int[] a = {8,10,15,20,25};
        System.out.println(Arrays.toString(a));
        System.out.println(isSortedInAscendingOrder(a));
    }
    public static boolean isSortedInAscendingOrder(int[] a) {
        for(int i=1;i<a.length;i++) {
            if(a[i-1] > a[i])
            return false;
        }
        return true;
    }
}
