public class ProductUser {
    public static void main(String[] args) {
        Product p1 = new Product("Watch", 100000, "Black");
        System.out.println("Product Name : " + p1.name);
        System.out.println("Product Price : " + p1.price);
        System.out.println("Product Color : " + p1.color);

        Product p2 = new Product("Shirt", 1000, "White");
        System.out.println("Product Name : " + p2.name);
        System.out.println("Product Price : " + p2.price);
        System.out.println("Product Color : " + p2.color);
    }
}
