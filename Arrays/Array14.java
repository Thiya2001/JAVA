import java.util.Arrays;
public class Array14 {
    public static void main(String[] args) {
        int a[] = {8,3,41,-23,72,3,5};
        System.out.println("a : " + Arrays.toString(a));
        int large = largeNum(a);
        System.out.println("Largerst Number is : " + large);
        int small = smallNum(a);
        System.out.println("Smallest Number is : " + small);
    }
    public static int largeNum(int []a) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            if(a[i] > largest)
            largest = a[i];
        }
        return largest;
    }
    public static int smallNum(int []a) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++) {
            if(a[i] < smallest)
            smallest = a[i];
        }
        return smallest;
    }
}
