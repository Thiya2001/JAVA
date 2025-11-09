public class String22 {
    public static void main(String[] args) {
        String s = "Hi Hello Hi how this and Hello";
        solve(s);
    }
    public static void solve(String s) {
        String a[] = s.split(" ");
        int n  = a.length;
        for(int i=0;i<n;i++) {
            int count = 0;
            for(int j=i+1;j<n;j++) {
                if(a[i].equals(a[j])) {
                    count++;
                }
            }
            if(count > 0)
            System.out.print(a[i] + " ");
        }
    }
}
