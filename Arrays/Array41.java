import java.util.Arrays;
public class Array41 {
    public static void printDuplicate(int[] a) {
        int n = a.length;
        for(int i=0;i<n;i++) {
            if(a[i] == Integer.MIN_VALUE)
            continue;
            int count = 0;
            for(int j=i+1;j<n;j++) {
                if(a[i] == a[j]) {
                    count++;
                    a[j] = Integer.MIN_VALUE;
                }
            }
            if(count > 0)
            System.out.println(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] a = {8,2,1,2,6,7,4,1,0};
        System.out.println(Arrays.toString(a));
        printDuplicate(a);
    }
}
