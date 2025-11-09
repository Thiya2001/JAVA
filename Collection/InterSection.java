import java.util.*;
public class InterSection {
    public static void main(String[] args) {
        List<Object> Ajay = new ArrayList<>();
        Ajay.add("Shirt");
        Ajay.add("TShirt");
        Ajay.add("Pants");
        Ajay.add("Coat Shirt");

        List<Object> Kalai = new ArrayList<>();
        Kalai.add("Jeans");
        Kalai.add("Shirt");
        Kalai.add("TShirt");
        Kalai.add("Pants");
        Kalai.add("Belt");

        Ajay.retainAll(Kalai);
        System.out.println(Ajay);
    }
}
