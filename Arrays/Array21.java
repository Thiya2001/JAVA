import java.util.Arrays;;
public class Array21 {
    public static int maxProfit(int[] a) {
        int n = a.length;
        int cp = a[0];
        int max = 0;
        for(int i=1;i<n;i++) {
            int sp = a[i];
            int profit = (sp - cp);
            max = Math.max(profit,max);
            if(sp < cp)
                cp = sp;
            }
            return max;
    }
    public static void main(String[] args) {
        int a[] = {7,1,5,3,6,4};
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("Buying And Seeling Stock is : " + maxProfit(a));
    }
}
