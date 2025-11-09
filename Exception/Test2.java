public class Test2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Hi");
        try {
            // System.out.println(arr[10]);
            // System.out.println(arr[10/0]);
            System.out.println(arr[10/5]);

        }
        catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter valid index");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("Bye");
    }
}
