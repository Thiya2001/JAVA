class ParentExtends {
    static int a = 10;
}
class Child extends ParentExtends {
    static int b = 20;
    public static void main(String[] args) {
        System.out.println(b);
        System.out.println(a);
    }
}