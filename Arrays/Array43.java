public class Array43 {
    public static void pairsOfArray(int[] a) {
        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++) {
                System.out.print(a[i] + "," + a[j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[] = {2,8,6,4,10};
        pairsOfArray(a);
    }
}
