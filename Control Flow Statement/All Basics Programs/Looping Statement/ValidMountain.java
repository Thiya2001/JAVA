public class ValidMountain {
    public static boolean validMountain(int[] a) {
        int n = a.length;
        if(n < 3)
        return false;
        int x = 0;
        for(int i=0;i<n;i++) {
            if(a[i] == a[i + 1])
            return false;
            if(a[i] > a[i + 1]) {
                x = i;
                break;
            }
        }
        if(x == 0)
        return false;
        for(int i=x;i<n-1;i++) {
            if(a[i] == a[i + 1])
            return false;
            if(a[i + 1] > a[i])
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int a[] = {0,2,3,4,5,2,1,0};
        System.out.print(validMountain(a));
    }
}