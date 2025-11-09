import java.util.Arrays;
public class MergeSort {
    public static int[] mergeSort(int[] a,int[] b) {
        int left = 0;
        int right = 0;
        int x = 0;
        int res[] = new int[a.length + b.length];
        while (left < a.length && right < b.length) {
            if(a[left] < b[right])
            res[x++] = a[left++];
            else
            res[x++] = b[right++];
        }
        while(left < a.length) {
            res[x++] =  a[left++];
        }
        while (right < b.length) {
            res[x++] = b[right++];
        }
        return res;
    }
    public static void main(String[] args) {
        int a[] = {8,14,28,24,26};
        int b[] = {4,5,7,12,15,37};
        Arrays.sort(a);
        Arrays.sort(b);
        int res[] = mergeSort(a,b);
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
        System.out.println("Merged Arrays : " + Arrays.toString(res));
    }
}
