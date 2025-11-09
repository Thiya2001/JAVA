public class School {
    public static void main(String[] args) {
        Student s1 = new Student("Pranav", 1, 200);
        Student s2 = new Student("Tabrez", 2, 0);
        Student s3 = new Student("Gaja", 3, -100);
        Student s4 = new Student("Shantanu", 4, 50);
        Student[] students = {s1, s2, s3, s4};
        for(int i=0;i<students.length;i++) {
            if(students[i].marks <= 31) {
                students[i].details();
                System.out.println("------------------");
            }
        }
    }
}
