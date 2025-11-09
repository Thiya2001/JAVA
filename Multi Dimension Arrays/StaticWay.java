public class StaticWay {
    public static void main(String[] args) {
        int[][] a = {
            {5,2,1},
            {4,2,6},
            {1,7,3},
        };
        for(int i=0;i<a.length;i++) {
            int l = 0, r = a[i].length - 1;
            while(l < r) {
                int temp = a[i][r];
                a[i][r] = a[i][l];
                a[i][l] = temp;
                l++;
                r--;
            }
        }
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a.length;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
