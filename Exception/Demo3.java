public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Hi");
        String s = "Hello";
        try {
            System.out.println(s.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Bye");
    }
}
