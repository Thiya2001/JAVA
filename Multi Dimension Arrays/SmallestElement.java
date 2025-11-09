public class SmallestElement {
    public static void main(String[] args) {
        int a[][] = {
            {4,7,3,8},
            {7,5,1,4},
            {8,-9,2,1},
        };
        for(int i=0;i<a.length;i++) {
            System.out.print(solve(a[i]) + " ");
        }
    }
    public static int solve(int[] a) {
        int small = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++) {
            if(small > a[i]) {
                small = a[i];
            }
        }
        return small;
    }
}
