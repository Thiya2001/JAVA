import java.util.Arrays;
import java.util.Scanner;
public class Array32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {4,5,6,4,9,7,1,7,3,7};
        System.out.println(Arrays.toString(a));
        System.out.print("Enter The N Value : ");
        nthLargest(a, sc.nextInt());
    }
    public static void nthLargest(int[] a, int n) {
        Arrays.sort(a);
        int k = 1;
        for(int i=a.length-1;i>0;i--) {
            if(k == n) {
                System.out.println(a[i]);
                return;
            }
            if(a[i] != a[i - 1]) {
                k++;
            }
            if(k == n) {
                System.out.println(a[i - 1]);
                return;
            }
        }
        System.out.println("Invalid.");
        return;
    }
}