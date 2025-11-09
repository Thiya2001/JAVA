import java.util.Arrays;
public class CountingSort {
    public static int findLargest(int[] a) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            if(a[i] > largest)
                largest = a[i];
        }
        return largest;
    }
    public static void countingSort(int[] a) {
        int largest = findLargest(a);
        int[] res = new int[largest + 1];
        for(int i=0;i<a.length;i++) {
            res[a[i]]++;
        }
        for(int i=0,x=0;i<res.length;i++) {
            while(res[i] > 0) {
                a[x++] = i;
                res[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 4, 3, 7, 4, 2};
        System.out.println("Before : " + Arrays.toString(a));
        countingSort(a);
        System.out.println("After : " + Arrays.toString(a));
    }
}

