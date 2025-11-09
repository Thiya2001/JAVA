import java.util.Arrays;
public class Array34 {
    public static void main(String[] args) {
        int[] a = {4,8,1,2,6,7};
        int target = 10;
        System.out.println(Arrays.toString(a));
        targetSumOf2Elements(a, target);
    }
    public static void targetSumOf2Elements(int[] a, int target) {
        Arrays.sort(a);
        int l = 0;
        int r = a.length-1;
        while(l < r){
            if(a[l] + a[r] == target) {
                System.out.println(a[l] + " , " + a[r]);
            }
            if(a[l] + a[r] < target)
            l++;
            else if(a[l] + a[r] > target)
            r--;
            else {
                l++;
                r--;
            }
        }
    }
}
