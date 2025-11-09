public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] a = {
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
        };
        System.out.println(a);
        System.out.println(a.length);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2].length);
        a[1][2] = 10;
        a[2][3] = 50;
        System.out.println(a[0][2]);
        System.out.println(a[1][2]);
        System.out.println(a[2][3]);
        System.out.println(a[2][45]);
    }
}
