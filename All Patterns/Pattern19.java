public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++) {
            int data = 1;
            for(int j=0;j<n;j++) {
                if(i + j >= n - 1) {
                    System.out.print(data++ + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
