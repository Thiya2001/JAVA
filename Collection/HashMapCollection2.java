import java.util.*;

public class HashMapCollection2 {
    public static void main(String[] args) {
        Map<String, Integer> basket = new HashMap<>();
        basket.put("Apple", 150);
        basket.put("Orange", 120);
        basket.put("Pineapple", 120);
        basket.put("Strawberry", 300);
        basket.put("Mango", 100);

        System.out.println(basket);

        System.out.println(basket.containsKey("Banana"));
        System.out.println(basket.containsKey("Mango"));

        System.out.println(basket.containsValue(120));
        System.out.println(basket.containsValue(200));

        basket.remove("Pineapple");
        System.out.println(basket);
    }
}
