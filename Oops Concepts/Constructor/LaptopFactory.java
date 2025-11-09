public class LaptopFactory {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        System.out.println(l1);
        System.out.println(l2);
        System.out.println("Laptop 1 Details");
        l1.details();
        System.out.println("Laptop 2 Details");
        l2.details();
        l1.typing();
        l1.watch();
    }
}
