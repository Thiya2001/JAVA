public class Pattern21 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++) {
            char uc = 'A', lc = 'a';
            for(int j=0;j<n;j++) {
                if(i + j <= n - 1) {
                    if(i % 2 == 0) {
                    System.out.print(lc++ + "  ");
                }
                    else {
                        System.out.print(uc++ + "  ");
                    }
                }
                else {
                    System.out.print(i + "  ");
                }
            }
            System.out.println();
        }
    }
}
