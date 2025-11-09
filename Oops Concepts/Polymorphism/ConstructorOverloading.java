public class ConstructorOverloading {
    String name;
    String color;
    double price;
    ConstructorOverloading() {
        //Load Instruction
        System.out.println("No Parameter");
    }
    ConstructorOverloading(String name) {
        //Load Instruction
        System.out.println("1 Parameter");
        this.name = name;
    }
    ConstructorOverloading(String name, String color) {
        this(name);
        System.out.println("2 Parameter");
        this.color = color;
    }
    ConstructorOverloading(String name, String color, double price) {
        this(name, color);
        System.out.println("3 Parameter");
        this.price = price;
    }
    public static void main(String[] args) {
        ConstructorOverloading c = new ConstructorOverloading("Maruti 800", "White", 100000);
    }
}
