public class Test {
    Test() {
        System.out.println(this);
    }
    public static void main(String[] args) {
        Test obj1 = new Test();
        Test obj2 = new Test();
        System.out.println("Object 1 : " + obj1);
        System.out.println("Object 2 : " + obj2);
    }
}
