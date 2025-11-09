interface Vehicle1 {
    void start();
    void stop();
}
class Car {
    String name;
    String brand;
    Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }
}
class ElectricCar extends Car implements Vehicle1 {
    ElectricCar(String name, String brand) {
        super(name, brand);
    }
    public void start() {
        System.out.println("Car Start");
    }
    public void stop() {
        System.out.println("Car Stop");
    }
}
class Main {
    public static void main(String[] args) {
        Vehicle1 v = new ElectricCar("Tesla", "Model S");
        v.start();
        v.stop();
    }
}