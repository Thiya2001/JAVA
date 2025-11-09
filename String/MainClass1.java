public class MainClass1 {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat("World");
        StringBuffer s1 = new StringBuffer("Java");
        s1.append(" Program");
        System.out.println(s);
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder("Web");
        s2.append(" Tech");
        System.out.println(s2);
    }
}
