import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int[]a) {
        System.out.println("Before Sorting : " + Arrays.toString(a));
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a.length-1;j++) {
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("After Sorting : " + Arrays.toString(a));
    }
    public static void main(String[] args) {
        int a[] = {28,24,22,30,23};
        bubbleSort(a);
    }
}
