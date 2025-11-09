import java.util.Arrays;
public class Array13 {
    public static void main(String[] args) {
        int a[] = {4,7,23,84,21,7};
        System.out.println("a : " + Arrays.toString(a));
        int res = oddNum(a);
        System.out.println("Odd a Number : " + res);
    }
    public static int oddNum(int[] a) {
        int sum = 0;
        for(int i=0;i<a.length;i++) {
            if(a[i] %2 != 0) {
                sum += a[i];
            }
        }
        return sum;
    }
}
