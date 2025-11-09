public class Product {
    String name;
    double price;
    String color;

    Product(String name, double price, String color) {
        this.name = name;
        this.price = price;;
        this.color = color;
    }
    public static Product getProduct(String name, double price, String color) {
        return new Product(name,price,color);
    }
}
