import java.util.Arrays;
public class Array22 {
    public static int[] duplicateElement(int[] a) {
        int n = a.length;
        int[] temp = new int[n];
        int k = 0;
        for(int i=0;i<n;i++) {
            boolean isduplicate = false;
            for(int j=0;j<k;j++) {
                if(a[i] == a[j]) {
                    isduplicate = true;
                    break;
                }
            }
            if(!isduplicate) {
                temp[k++] = a[i];
            }
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++) {
            res[i] = temp[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {1,2,1,6,5,4};
        System.out.println("a : " + Arrays.toString(a));
        int res[] = duplicateElement(a);
        System.out.println("Remove Duplicates : " + Arrays.toString(res));
    }
}
