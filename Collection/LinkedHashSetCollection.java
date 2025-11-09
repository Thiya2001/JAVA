import java.util.Set;
import java.util.LinkedHashSet;
public class LinkedHashSetCollection {
    public static void main(String[] args) {
        Set<Object> items = new LinkedHashSet<>();
        items.add(10);
        items.add(null);
        items.add(20);
        items.add(30);
        System.out.println(items);
    }
}
