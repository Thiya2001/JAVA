import java.util.Arrays;
public class Array16 {
    public static void main(String[] args) {
        int a[] = {5,2,6,1};
        System.out.println("a : " + Arrays.toString(a));
        int res[] = findAfterSmallestNum(a);
        System.out.println("Smallest Number After " + Arrays.toString(res) + " Self.");
    }
    public static int[] findAfterSmallestNum(int[] a) {
        int count;
        int res[] = new int[a.length];
        for(int i=0;i<a.length;i++) {
            count = 0;
            for(int j=i+1;j<a.length;j++) {
                if(a[j] < a[i])
                    count++;
            }
            res[i] = count;
        }
        return res;
    }
}
