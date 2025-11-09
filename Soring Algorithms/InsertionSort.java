import java.util.Arrays;
public class InsertionSort {
    public static void insertionSort(int[] a) {
        for(int i=0;i<a.length;i++) {
            int curr = a[i];
            int prev = i - 1;
            while (prev >= 0 && a[prev] > curr) {
                a[prev + 1] = a[prev];
                prev--;
            }
            a[prev + 1] = curr;
        }
    }
    public static void main(String[] args) {
        int[] a = {6, 5, 3, 1, 2};
        System.out.println(Arrays.toString(a));
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
