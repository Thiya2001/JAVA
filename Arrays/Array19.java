import java.util.Arrays;
public class Array19 {
    public static int trappingRainWater(int[] a) {
        int n = a.length;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        rightmax[n-1] = a[n-1];
        for(int i=n-2;i>=0;i--)
            rightmax[i] = Math.max(a[i],rightmax[i+1]);
            leftmax[0] = a[0];
        for(int i=1;i<n;i++)
            leftmax[i] = Math.max(a[i],leftmax[i-1]);
            int sum = 0;
        for(int i=0;i<n;i++)
            sum += ((Math.min(leftmax[i],rightmax[i]))-a[i]);
        return sum;
    }
    public static void main(String[] args) {
        int[]a = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("a : " + Arrays.toString(a));
        int res = trappingRainWater(a);
        System.out.println("Product Except Self : " +res);
    }
}
