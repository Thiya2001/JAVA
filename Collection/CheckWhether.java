import java.util.*;

public class CheckWhether {
    public static void main(String[] args) {
        List<Object> Gaja = new ArrayList<>();
        Gaja.add("Hamam Soap");
        Gaja.add("Chocolate");
        Gaja.add("Laptop");
        Gaja.add("Mobile");
        System.out.println(Gaja);
        System.out.println(Gaja.contains("Chocolate"));
        System.out.println(Gaja.contains("Laptop"));
        System.out.println(Gaja.contains("Water"));
        System.out.println(Gaja.contains("Pad"));
    }
}
