public class Array3 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[4];
        for(int i=0;i<a.length;i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int j=b.length-1;j>=0;j--) {
            System.out.print(j + " ");
        }
    }
}
