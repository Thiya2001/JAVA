public class Pattern27 {
    public static void main(String[] args) {
        int n = 7;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                // if(i == j) {
                // if(i == j + 1) {
                // if(i == j + 2) {
                if(i == j + n / 2) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
