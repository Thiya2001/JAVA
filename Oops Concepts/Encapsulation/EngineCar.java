public class EngineCar {
    String name;
    String color;
    double price;
    Engine engine;

    //Constructor
    EngineCar(String name, String color, double price, Engine engine) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.engine = engine;
    }

    //Behaviours
    public void detailsOfEngineCar() {
        System.out.println("Details Of EngineCar : ");
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
        engine.detailsOfEngine();
    }
}

