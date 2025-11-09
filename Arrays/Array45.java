public class Array45 {
    public static int subArrayMaxElement(int[] a) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            int cur_sum = 0;
            for(int j=i;j<a.length;j++) {
                cur_sum += a[j];
                max = Math.max(cur_sum, max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[] = {2,-1,-3,2,4};
        int res = subArrayMaxElement(a);
        System.out.println(res);
    }
}
