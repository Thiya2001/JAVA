public class BikeFactory {
    public static void main(String[] args) {
        Bike obj1 = new Bike("RX100", "Black", 1000000);
        obj1.details();
        Bike obj2 = new Bike("KTM", "Orange", 250000);
        obj2.details();
    }
}
