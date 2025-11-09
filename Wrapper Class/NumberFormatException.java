public class NumberFormatException {
    public static void main(String[] args) {
        String s = "ten";
        try {
            int no = Integer.parseInt(s);
            System.out.println(no);
        }
        catch (Exception e) {
            System.out.println("Invalid Value Passed");
        }
    }
}
