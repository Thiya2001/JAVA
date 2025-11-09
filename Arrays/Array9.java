import java.util.Arrays;
public class Array9 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        System.out.println("Before Reversing : " + Arrays.toString(a));
        int res[] = solve(a);
        System.out.println("After Reversing : " + Arrays.toString(res));
    }
    public static int[] solve(int[] a) {
        int l=0, r=a.length-1;
        while(a[l] < a[r]) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
        return a;
    }
}
