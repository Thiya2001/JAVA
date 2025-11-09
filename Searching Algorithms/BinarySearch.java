import java.util.*;
public class BinarySearch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int a[] = {10,20,30,40,50,60,70,80};
        if(binarySearch(a))
        System.out.println("Present");
        else
        System.out.println("Not Present");
    }
    public static boolean binarySearch(int[] a) {
        System.out.println(Arrays.toString(a));
        System.out.print("Enter The Key Element : ");
        int key = sc.nextInt();
        int l = 0;
        int h = a.length-1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if(key == a[mid])
            return true;
            else if(key < a[mid])
            h = mid - 1;
            else if(key > a[mid])
            l = mid + 1;
        }
        return false;
    }
}
