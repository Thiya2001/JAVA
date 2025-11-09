import java.util.*;
public class LinearSearch {
    public static boolean linearSearch(int[] a, int element) {
        for(int i=0;i<a.length;i++) {
            if(a[i] == element)
            return true;
        }
        return false;
    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a[] = {8,3,6,4,34,37,14,23,24,25,38,42,18,72,84};
        System.out.println("a : " + Arrays.toString(a));
        System.out.print("Enter the element to search : ");
        if(linearSearch(a, sc.nextInt()))
        System.out.println("Present");
        else
        System.out.println("Not Present");
    }
}
