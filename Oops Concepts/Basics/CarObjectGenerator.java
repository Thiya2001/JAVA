public class CarObjectGenerator {
    public static void main(String[] args) {
        Car ref1 = new Car();
        Car ref2 = new Car();
        System.out.println(ref1);
        System.out.println(ref2);
        System.out.println("Car Name : " + ref1.name);
        System.out.println("Car Name : " + ref2.name);
        System.out.println("Car 1 details");
        ref1.details();
        System.out.println("Car 2 details");
        ref2.details();
        ref1.start();
        ref1.stop();
    }
}
