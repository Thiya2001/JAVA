public class MethodOverloading {
    //Change the no.of formal arguments
    public static void add(int a, int b) {
        System.out.println("Method with 2 arguments");
    }
    public static void add(int a, int b, int c) {
        System.out.println("Method with 3 arguments");
    }
    //Change datatype of formal arguments
    public static void sub(int a, int b) {
        System.out.println("Integer type arguments");
    }
    public static void sub(double a, double b) {
        System.out.println("Double type arguments");
    }
    //Change the order of formal arguments
    public static void mul(int a, double b) {
        System.out.println("Integer and Double arguments");
    }
    public static void mul(double a, int b) {
        System.out.println("Double and Integer arguments");
    }
    public static void main(String[] args) {
        add(10, 20);
        sub(10.5, 20.5);
        mul(10.5, 10);
    }
}
