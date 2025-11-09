import java.util.Arrays;
public class Array12 {
    public static void main(String[] args) {
        char a[] = {'A','J','R','S','V'};
        System.out.println("Before Reverse Char : " + Arrays.toString(a));
        char res[] = revChar(a);
        System.out.println("After Reverse Char : " + Arrays.toString(res));
    }
    public static char[] revChar(char[] a) {
        int l=0, r=a.length-1;
        while(a[l] < a[r]) {
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
        return a;
    }
}
