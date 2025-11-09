//this() and super() Statement
public class Vehicle {
    static String owner = "Pranav";
    String name;
    Vehicle(String name) {
        //Load Instruction
        this.name = name;
    }
    public void start() {
        System.out.println("Starting");
    }
}
class Bike extends Vehicle {
    String model;
    String color;
    Bike(String name, String model, int color) {
        super(name);
        //Load Instruction
        this.model = model;
        this.color = color;
    }
    public void speed() {
        System.out.println("Speeding");
    }
    public static void main(String[] args) {
        Bike b1 = new Bike("Pulser", "Ns200", "Black");
        Bike b2 = new Bike("R15", "V4", "Blue");

        System.out.println(b1.name + " " + b1.model + " " + b1.color);
        System.out.println(b2.name + " " + b2.model + " " + b2.color);
    }
}
