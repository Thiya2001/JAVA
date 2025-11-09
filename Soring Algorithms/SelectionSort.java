import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] a) {
        System.out.println("Before Sorting : " + Arrays.toString(a));
        for(int i=0;i<a.length-1;i++) {
            int s = i;
            for(int j=i+1;j<a.length;j++) {
                if(a[j] < a[s])
                s = j;
            }
            int temp = a[i];
            a[i] = a[s];
            a[s] = temp;
        }
        System.out.println("After Sorting : " + Arrays.toString(a));
    }
    public static void main(String[] args) {
        int a[] = {8,9,11,4,3,2,1};
        selectionSort(a);
    }
}
