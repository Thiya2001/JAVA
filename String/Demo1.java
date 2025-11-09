public class Demo1 {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = new String("Hello");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s.equals(s1));
    }
}
