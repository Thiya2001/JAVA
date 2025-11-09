public class Bike {
    String name;
    String color;
    double price;

    static String owner = "Pranav";

    Bike(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
    public void start() {
        System.out.println("Bike Started");
    }
    public void stop() {
        System.out.println("Bike Stopped");
    }
    public void details() {
        System.out.println("-----------------------");
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
        System.out.println("Owner : " + owner);
    }
}
