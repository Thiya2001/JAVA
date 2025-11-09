abstract class LearningPlatform {
    public abstract void startCourse();
    public abstract void Login();
    public void attendance() {
        System.out.println("Attendance done");
    }
}
class Udemy extends LearningPlatform {
    public void startCourse() {
        System.out.println("Course started");
    }
    public void Login() {
        System.out.println("Login successful");
    }
}
class User {
    public static void main(String[] args) {
        LearningPlatform ref = new Udemy();
        ref.startCourse();
    }
}
