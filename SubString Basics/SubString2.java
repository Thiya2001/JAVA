import java.util.Arrays;
public class SubString2 {
    public static void main(String[] args) {
        String s = "This is Thiyaga Rajan";
        String ans1[] = s.split("");
        String ans2[] = s.split(" ");
        System.out.println(Arrays.toString(ans1));
        System.out.println(Arrays.toString(ans2));
        System.out.println(ans1.length);
        System.out.println(ans2.length);
    }
}
