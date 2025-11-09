import java.util.Objects;
public class Bike implements Cloneable {
    String name;
    String color;
    int price;

    Bike(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public String toString() {
        return "Bike[Name = " + name + ", Color = " + color + ", Price = " + price + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, color, price);
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Bike) {
            Bike b = (Bike)obj;
            return this.name.equals(b.name) &&
            this.color.equals(b.color) &&
            this.price == b.price;
        }
        return false;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Bike b1 = new Bike("Pulsar", "Pink", 200000);
        System.out.println(b1);

        Object b2 = b1.clone();
        System.out.println(b2);
        System.out.println(b1.equals(b2));

        Bike b3 = (Bike)b1.clone();
        System.out.println(b3);
    }
}
