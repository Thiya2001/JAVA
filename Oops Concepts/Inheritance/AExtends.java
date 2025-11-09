public class AExtends {
    static int x = 10;
    public  static void display() {
        System.out.println("Display");
    }
}
class B extends AExtends {
    static int y = 20;
    public static void print() {
        System.out.println("Print");
    }
    public static void main(String[] args) {
        System.out.println(y);
        System.out.println(x);
        print();
        display();
        System.out.println(B.x);
        B.display();
    }
}
