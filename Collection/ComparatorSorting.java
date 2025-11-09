import java.util.*;
public class ComparatorSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student1> stud = new ArrayList<>();

        stud.add(new Student1(5, "Tabrez", 80));
        stud.add(new Student1(2, "Pranav", 70));
        stud.add(new Student1(4, "Nithil", 90));
        stud.add(new Student1(1, "Gaja", 85));
        stud.add(new Student1(3, "Shantanu", 95));

        System.out.println("\t\t Before Sorting");

        for(Student1 s : stud)
        System.out.println(s);

        // Collections.sort(stud, (s1, s2) -> s1.id - s2.id);
        // Collections.sort(stud, (s1, s2) -> s1.name.compareTo(s2.name));
        Collections.sort(stud, (s1, s2) -> s1.marks - s2.marks);

        System.out.println("\t\t After Sorting");

        for(Student1 s : stud)
        System.out.println(s);
    }
}
