public class ErrorCaugh {
    public static void main(String[] args) {
        display();
    }
    public static void display() {
        try {
            long[] arr = new long[999999999];
        }
        catch (Error e) {
            System.out.println("Error caught: " + e);
        }
    }
}
