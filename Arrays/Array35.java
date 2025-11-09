import java.util.Arrays;
public class Array35 {
    public static void main(String[] args) {
        int[] a = {1,4,45,6,10,8};
        int target = 13;
        System.out.println(Arrays.toString(a));
        boolean res = targetSumOf3ElementsUsingBoolean(a, target);
        System.out.println(res);
    }
    public static boolean targetSumOf3ElementsUsingBoolean(int[] a, int target) {
        Arrays.sort(a);
        int l = 0;
        int r = a.length-1;
        for(int i=0;i<a.length-2;i++) {
            while(l < r){
                if(a[i] + a[l] + a[r] == target) {
                    return true;
                }
                if(a[i] + a[l] + a[r] < target) {
                l++;
                }
                else if(a[i] + a[l] + a[r] > target) {
                r--;
                }
                else {
                    l++;
                    r--;
                }
            }
        }
        return false;
    }
}
