import java.util.Arrays;
public class Array26 {
    public static boolean solve(int[] a) {
        Arrays.sort(a);
        for(int i=1;i<a.length;i++) {
            if(a[i] == a[i - 1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int[] a = {10,20,10,30,40};
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("Contains Duplicates : " + solve(a));
    }
}
