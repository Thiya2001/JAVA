import java.util.*;
public class LinkedHashMapCollection {
    public static void main(String[] args) {
        Map<String, Integer> bottle = new LinkedHashMap<>();
        bottle.put("Water bottle", 20);
        bottle.put("7 Up", 40);
        bottle.put("Mango", 50);
        bottle.put("Bavonto", 45);
        System.out.println(bottle);

        bottle.remove("Water bottle");
        System.out.println(bottle);

        bottle.put("Mango", 180);
        System.out.println(bottle);

        System.out.println(bottle.get("Bavonto"));
        System.out.println(bottle.values());
        System.out.println(bottle.keySet());
    }
}
