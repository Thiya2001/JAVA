import java.util.*;
import java.util.Map.Entry;

public class TreeMapCollection {
    public static void main(String[] args) {
        Map<String, Integer> flavours = new TreeMap<>();
        flavours.put("Chocolate", 60);
        flavours.put("Strawberry", 40);
        flavours.put("Vanilla", 80);
        flavours.put("Red Velvet", 100);
        flavours.put("Butter Scotch", 50);
        System.out.println(flavours);

        for(Entry<String, Integer> x : flavours.entrySet()) {
            System.out.println(x.getKey() + " - " + x.getValue());
        }
    }
}
