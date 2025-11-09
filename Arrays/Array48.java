//Average of Positive and Negative Arrays

import java.util.Arrays;

public class Array48 {
    public static int positiveArr(int[] a) {
        int s = 0, c= 0, i = 0;
        while(i < a.length) {
            if(a[i] > 0) {
                s += a[i];
                c++;
            }
            i++;
        }
        return s/c;
    }
    public static int negativeArr(int[] a) {
        int s = 0, c = 0, i = 0;
        while(i < a.length) {
            if(a[i] < 0) {
                s += a[i];
                c++;
            }
            i++;
        }
        return s/c;
    }
    public static void main(String args[]) {
        int[] a = {8, -3, -2, 4, 8, 2, -1};
        System.out.println(Arrays.toString(a));
        System.out.println("Average Of Positive : " + positiveArr(a));
        System.out.println("Average Of Negative : " + negativeArr(a));
    }
}
