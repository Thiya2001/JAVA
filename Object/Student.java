import java.util.Objects;
public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student[Name = " + name + " , Age = " + age + "]";
    }
    public int hashCode() {
        return Objects.hash(name, age);
    }
    public static void main(String args[]) {
        Student s1 = new Student("Santhosh", 23);
        Student s2 = new Student("Vignesh", 24);
        Student s3 = new Student("Santhosh", 23);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
