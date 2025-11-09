//Blue Print
public class Laptop {
    String name;
    String color;
    double price;
    static String brand = "HP";
    public void typing() {
        System.out.println("Typing");
    }
    public void watch() {
        System.out.println("Watching");
    }
    public void details() {
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
        System.out.println("Brand : " + brand);
    }
}
