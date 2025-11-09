public class SuperStatement {
    String name;
    int age;
    SuperStatement(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends SuperStatement {
    int id;
    double salary;
    Employee(int id, double salary, String name, int age) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(1, 10000, "Pranav", 400);
        Employee e2 = new Employee(2, 80000, "Gaja", 16);
        e1.details();
        e2.details();
    }
    public void details() {
        System.out.println("Employee Details : ");
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
    }
}
