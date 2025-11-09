interface Payment {
    void pay();
}
interface LearningPlatform extends Payment {
    void login();
}
class Udemy implements LearningPlatform {
    public void login() {
        System.out.println("Login Success");
    }
    public void pay() {
        System.out.println("Payment Success");
    }
}
class Main {
    public static void main(String[] args) {
        LearningPlatform lp = new Udemy();
        lp.login();
        lp.pay();
    }
}
