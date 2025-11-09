import java.util.*;
public class Student {
    int id;
    String name;
    double marks;
    int age;

    Student(int id, String name, double marks, int age) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [Id = " + id + ", Name = " + name + ", Marks = " + marks + ", Age = " + age + "]";
    }
    public static void main(String[] args) {
        List<Object> Students = new ArrayList<>();
        Students.add(new Student(1, "Pranav", 100, 80));
        Students.add(new Student(2, "Shantanu", 80, 15));
        Students.add(new Student(3, "Nagaraj", 32, 20));
        Students.add(new Student(4, "Tabrez", 90, 50));
        Students.add(new Student(5, "Gaja", 00, 18));

        for(int i = 0;i<Students.size();i++) {
            Student s = (Student)Students.get(i);
            if(s.marks < 34)
            System.out.println(Students.get(i));
        }
    }
}
