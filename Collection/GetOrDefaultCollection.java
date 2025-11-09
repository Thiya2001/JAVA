import java.util.*;

public class GetOrDefaultCollection {
    public static void main(String[] args) {
        String s = "programmer";

        Map<Character, Integer> freq = new HashMap<>();

        for(char x : s.toCharArray()) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        System.out.println(freq);
    }
}
