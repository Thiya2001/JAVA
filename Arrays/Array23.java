import java.util.Arrays;
public class Array23 {
    public static int[] solve(int[] a) {
        int l = 0;
        int r = a.length-1;
        while(l < r) {
            if(a[l] == 0 && a[r] == 1) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
            if(a[l] == 1)
                l++;
            if(a[r] == 0)
                r--;
        }
        return a;
    }
    public static void main(String args[]) {
        int[] a = {0,1,0,0,1,0,1,1};
        System.out.println("a : " + Arrays.toString(a));
        int[] res = solve(a);
        System.out.println("Shifting Element : " + Arrays.toString(res));
    }
}
