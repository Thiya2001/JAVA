import java.util.*;
public class GenericCollection {
    public static void main(String[] args) {
        List<Integer> bag1 = new ArrayList<>();
        bag1.add(10);
        bag1.add(20);
        bag1.add(30);
        bag1.add(null);
        for(Integer x : bag1) {
            System.out.print(x + "\t");
        }
        System.out.println();

        List<String> bag2 = new ArrayList<>();
        bag2.add("Hii");
        bag2.add("Hello");
        bag2.add("Bye");
        bag2.add(null);
        for(String s : bag2) {
            System.out.print(s + "\t");
        }
        System.out.println();

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(1, "Pranav", 100, 80));
        stud.add(new Student(2, "Shantanu", 80, 15));
        stud.add(new Student(3, "Nagaraj", 32, 20));
        stud.add(new Student(4, "Tabrez", 90, 50));
        stud.add(new Student(5, "Gaja", 00, 18));
        stud.add(null);
        for(Student s : stud) {
            System.out.println(s);
        }
    }
}
