import java.util.Arrays;;
public class Array28 {
    public static void main(String[] args) {
        int[] a = {1,1,0,1,1,1};
        System.out.println("a : " + Arrays.toString(a));
        int res = solve(a);
        System.out.println("Consecutive 1's : " + res);
    }
    public static int solve(int[] a) {
        int count = 0;
        int res = 0;
        for(int i=0;i<a.length;i++) {
            if(a[i] == 1) {
                count += 1;
            }
            else {
                count = 0;
            }
            res = Math.max(res,count);
        }
        return res;
    }
}
