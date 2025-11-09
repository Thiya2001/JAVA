import java.util.Arrays;
public class FindSearchElement {
    public static int[] searchElement(int[] a,int tar) {
        int first = firstElement(a, tar);
        int last = lastElement(a, tar);
        return new int[] {first, last};
    }
    public static int firstElement(int[] a, int tar) {
        int low = 0;
        int high = a.length - 1;
        int ans = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(a[mid] == tar) {
                ans = mid;
                high = mid - 1;
            }
            else if(a[mid] < tar)
                low = mid + 1;
            else
            high = mid - 1;
        }
        return ans;
    }
    public static int lastElement(int[] a,int tar) {
        int low = 0;
        int high = a.length - 1;
        int ans = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(a[mid] == tar) {
                ans = mid;
                low = mid + 1;
            }
            else if(a[mid] < tar)
                low = mid + 1;
            else
            high = mid - 1;
        }
        return ans;
    }
    public static void main(String [] args) {
        int a[] = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchElement(a,8)));
    }
}
