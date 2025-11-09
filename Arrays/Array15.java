import java.util.Arrays;
public class Array15 {
    public static void main(String[] args) {
        int a[] = {3,4,1,2,5,7,4,9};
        System.out.println("a : " + Arrays.toString(a));
        int res = findSunrise(a);
        System.out.println("Sunrise is visible for " + res + " Building");
    }
    public static int findSunrise(int []a) {
        int count = 1;
        int maximum = a[0];
        for(int i=1;i<a.length;i++) {
            if(a[i] > maximum){
            count++;
            maximum = a[i];
            }
        }
        return count;
    }
}
