public class String12 {
    public static void main(String[] args) {
        String s = "ab23c4d1";
        System.out.println(s);
        System.out.println(solve(s));
    }
    public static int solve(String s) {
        char[] a = s.toCharArray();
        int sum = 0;
        for(int i=0;i<a.length;i++) {
            if(a[i] >= '0' && a[i] <= '9')
            sum += a[i] - 48;
        }
        return sum;
    }
}
