public class SnakeProblem {
    public static void solve(int a[]) {
        int l = 0, r = a.length - 1;
        while(l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        int a[][] = {
            {4,7,3,8},
            {7,5,1,4},
            {8,9,2,1},
            {1,2,3,4},
        };
        for(int i=0;i<a.length;i++) {
            if(i % 2 != 0)
            solve(a[i]);
            for(int j=0;j<a.length;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
