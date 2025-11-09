import java.util.Objects;
import java.util.Scanner;

public class Student3 {
    static Scanner sc = new Scanner(System.in);
    int rollNo;
    String name;
    long contact;

    Student3(int rollNo, String name, long contact) {
        this.rollNo = rollNo;
        this.name = name;
        this.contact = contact;
    }
    @Override
    public String toString() {
        return "Student [RollNo : " + rollNo + ", Name : " + name + ", Contact : " + contact + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(contact, name, rollNo);
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student3) {
            Student3 s = (Student3)obj;
            return this.rollNo == s.rollNo &&
            this.name.equals(s.name) &&
            this.contact == s.contact;
        }
        return false;
    }
    public static void addStudents(Student3[] Students) {
        for(int i=0;i<Students.length;i++) {
            System.out.println("Enter Student details");
            System.out.print("Enter name : ");
            String name = sc.next();
            System.out.print("Enter roll No : ");
            int rollNo = sc.nextInt();
            System.out.print("Enter Contact : ");
            long contact = sc.nextLong();

            Student3 s = new Student3(rollNo, name, contact);
            Students[i] = s;
            System.out.println("Student added Successfully\n");
        }
    }
    public static void display(Student3[] Students) {
        for(Student3 s : Students) {
            if(s != null)
            System.out.println(s);
        }
    }
    public static void removeDuplicates(Student3[] Students) {
        for(int i=0;i<Students.length;i++) {
            if(Students[i] == null)
            continue;
            for(int j=i+1;j<Students.length;j++) {
                if(Students[j] != null && Students[i].equals(Students[j]))
                Students[j] = null;
            }
        }
    }
    public static void main(String[] args) {
        Student3[] Students = new Student3[4];
        addStudents(Students);
        System.out.println("\n Details of added Students :");
        display(Students);
        removeDuplicates(Students);
        System.out.println("\n Details of students after removing duplicates :");
        display(Students);
    }
}
