import java.util.Arrays;

public class Array46 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = new int [a.length];
        for(int i=0;i<a.length;i++) {
            int x=1;
            for(int j=0;j<a.length;j++) {
                if(i != j) {
                    x = x * a[j];
                }
                b[i] = x;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
