import java.util.Map;
import java.util.HashMap;

public class HashMapCollection1 {
    public static void main(String[] args) {
        Map<String, Integer> player = new HashMap<>();

        System.err.println(player);
        player.put("Dhoni", 7);
        player.put("Kohli", 18);
        player.put("Rohit", 45);
        player.put("Sachin", 10);
        player.put("Raina", 3);
        System.err.println(player);
    }
}
