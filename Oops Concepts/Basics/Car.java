//Blue print
public class Car {
    String name;
    String color;
    double price;

    static String owner = "Thiygu";
    public void start() {
        System.out.println("Car is Started");
    }
    public void stop() {
        System.out.println("Car is stopped");
    }
    public void details() {
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
        System.out.println("Owner : " + owner);
    }
}
