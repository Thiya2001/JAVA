import java.util.Arrays;
public class Array20 {
    public static int maxArea(int[] a) {
        int x = 0, y = a.length-1;
        int area = 0, max = 0;
        while(x < y) {
            int l = Math.min(a[x],a[y]);
            int b = y - x;
            area = l * b;
            max = Math.max(area, max);
            if(a[x] < a[y])
            x++;
            else {
                y--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("Container with Most Water : " + maxArea(a));
    }
}
