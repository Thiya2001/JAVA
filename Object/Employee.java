public class Employee extends Object {
    String name;
    double salary;
    int empId;

    public Employee(String name, double salary, int empId) {
        super();
        this.name = name;
        this.salary = salary;
        this.empId = empId;
    }
    @Override
    public String toString() {
        return "Employee[Name = " + name + " , Salary = " + salary + " , Emp Id = " + empId + "]";
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Pranav", 0, 1);
        Employee e2 = new Employee("Gaja", -10000, 420);
        Employee e3 = new Employee("Santanu", 10000, 5);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
