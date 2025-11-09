public class String13 {
    public static void main(String[] args) {
        String s = "A2$#bcDEf";
        System.out.println(s);
        System.out.println(solve(s));
    }
    public static String solve(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        for(int i=0;i<n;i++) {
            if(a[i] >= 'A' && a[i] <= 'Z')
            a[i] += 32;
            else if(Character.isLowerCase(a[i]))
            a[i] -= 32;
        }
        return new String(a);
    }
}
