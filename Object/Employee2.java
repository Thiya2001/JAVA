import java.util.Objects;
public class Employee2 extends Object {
    int empId;
    String name;
    int age;
    Employee2(int empId, String name, int age) {
        this.empId = empId;
        this.name = name;
        this.age = age;
    }
    @Override
    public int hashCode() {
        return Objects.hash(empId, name, age);
    }
    public static void main(String[] args) {
        Employee2 e1 = new Employee2(1, "Rajini", 60);
        Employee2 e2 = new Employee2(1, "Rajini", 60);

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        System.out.println(e1);
        System.out.println(e2);
    }
}
