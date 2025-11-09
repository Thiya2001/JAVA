public class Employee3 {
    int id;
    String name;
    Employee3(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void Finalize() {
        System.out.println("Object removed from memory");
    }
    public static void main(String[] args) {
        Employee3 e1 = new Employee3(1, "Pranav");
        Employee3 e2 = new Employee3(2, "Gaja");

        System.out.println(e1);
        System.out.println(e2);

        e1 = null;
        e2 = null;

        System.out.println(e1);
        System.out.println(e2);
    }
}
