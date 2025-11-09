public class String14 {
    public static void main(String[] args) {
        String s = "hi@#how@are";
        System.out.println(s);
        System.out.println(solve(s));
    }
    public static String solve(String s) {
        char a[] = s.toCharArray();
        int l = 0;
        int r = a.length - 1;
        while(l < r) {
            if(Character.isLetter(a[l]) && Character.isLetter(a[r])) {
            char temp = a[r];
            a[r] = a[l];
            a[l] = temp;
            l++;
            r--;
        }
        if(!Character.isLetter(a[l]))
        l++;
        if(!Character.isLetter(a[r]))
        r--;
        }
        return new String(a);
    }
}
