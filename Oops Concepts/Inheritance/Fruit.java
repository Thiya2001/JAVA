//Object Sharing
public class Fruit {
    String name;
    String color;
    double price;
    Fruit(String name, String color, double price) {
        //Load Instruction
        this.name = name;
        this.color = color;
        this.price = price;
    }
    public static void main(String[] args) {
        Fruit f1, f2, f3, f4, f5;
        f1 = new Fruit("Apple", "Red", 300);
        f2 = f1;   //Fruit@123
        f3 = f2;   //Fruit@123
        f4 = f3;   //Fruit@123
        f5 = f1;   //Fruit@123
        System.out.println(f1.name);
        System.out.println(f4.name);

        System.out.println(f2.price);
        System.out.println(f3.price);

        f5.price = 200;

        System.out.println(f2.price);
        System.out.println(f3.price);
    }
}
