public class Method10 {
    public static double calculateSimpleInterest(double p, double r, double t) {
        return (p*r*t)/100;
    }
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 5;
        double time = 2;

        double interest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple interest = " + interest);
    }
}