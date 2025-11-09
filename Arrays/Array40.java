import java.util.Arrays;
public class Array40 {
    public static int[] removeDuplicate(int[] a) {
        int count = 0, n = a.length;
        for(int i=0;i<n;i++) {
            if(a[i] == Integer.MIN_VALUE)
            continue;
            for(int j=i+1;j<n;j++) {
                if(a[i] == a[j]) {
                    count++;
                    a[j] = Integer.MIN_VALUE;
                }
            }
        }
        int[] res = new int[n-count];
        for(int i=0,x=0;i<n;i++) {
            if(a[i] != Integer.MIN_VALUE)
            res[x++] = a[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {8,4,8,3,5,7,6,3,1};
        System.out.println(Arrays.toString(a));
        int[] res = removeDuplicate(a);
        System.out.println(Arrays.toString(res));
    }
}
