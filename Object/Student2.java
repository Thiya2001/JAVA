import java.util.Objects;
public class Student2 {
    int id;
    String name;
    long contact;
    Student2(int id, String name, long contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }
    public String toString() {
        return "Id : " + id + ", Name : " + name + ", Contact : " + contact;
    }
    public int hashCode() {
        return Objects.hash(id, name, contact);
    }
    public boolean equals(Object obj) {
        if(obj instanceof Student2) {
            Student2 s = (Student2)obj;
            return this.id == s.id && this.name.equals(s.name) && this.contact == s.contact;
        }
        return false;
    }
    public static void main(String[] args) {
        Student2 s1 = new Student2(1, "Daiyana", 1234444565);
        Student2 s2 = new Student2(1, "Dinga", 456789123);
        Student2 s3 = new Student2(1, "Daiyana", 1234444565);
        Employee2 e1 = new Employee2(1, "Rajini", 60);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(e1);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(e1.hashCode());

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s1));
        System.out.println(s2.equals(s2));
        System.out.println(s3.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(e1));
    }
}
