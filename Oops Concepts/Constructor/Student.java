public class Student {
    String name;
    int rollno;
    double marks;

    Student(String name, int rollno, double marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    public void details() {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollno);
        System.out.println("Marks : " + marks);
    }
}
