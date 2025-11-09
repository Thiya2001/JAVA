public class Demo2 {
    public static void main(String [] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2); // true, same reference in string pool
        String s3 = new String("Hi");
        String s4 = new String("Hi");
        System.out.println(s3 == s4); // false, different references
    }
}
