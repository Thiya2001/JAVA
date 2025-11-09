import java.util.*;

public class Student1 {
    int id;
    String name;
    int marks;

    public Student1(int id, String name, int marks) {
        super();
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student1[id = " + id + " , name = " + name + " , marks = " + marks + "]";
    }
    class SortStudentsById implements Comparator <Student1> {
        public int compare(Student1 s1 , Student1 s2) {
            return s1.id - s2.id;
        }
    }
    class SortStudentsByName implements Comparator <Student1> {
        public int compare(Student1 s1 , Student1 s2) {
            return s1.name.compareTo(s2.name);
        }
    }
    class SortStudentsByMarks implements Comparator <Student1> {
        public int compare(Student1 s1 , Student1 s2) {
            return s1.marks - s2.marks;
        }
    }
}
