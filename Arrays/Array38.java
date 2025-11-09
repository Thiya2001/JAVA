public class Array38 {
    public static void missingNumber(int[] a) {
        int j = 1;
        for(int i=0;i<a.length;i++,j++) {
            if(a[i] != j) {
                System.out.println(j + " ");
                i--;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,4,5,8};
        missingNumber(a);
    }
}
