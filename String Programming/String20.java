public class String20 {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "defabc";
        String ans = s1.concat(s1);
        System.out.println(ans.contains(s2));
    }
}
