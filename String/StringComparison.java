public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Adam";
        String s2 = "Adam";
        String s3 = "Aaysuh";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.compareTo(s1));
    }
}
