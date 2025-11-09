import java.util.*;
public class HashSetCollection {
    public static void main(String[] args) {
        Set<Object> items = new HashSet<>();
        System.out.println(items);
        items.add(10);
        items.add(null);
        items.add(30);
        items.add(20);
        System.out.println(items);
        items.add(10);
        items.add(10);
        System.out.println(items);

        Iterator<Object> i = items.iterator();
        while (i.hasNext()) {
            System.out.println(i.next() + "\t");
        }
        System.out.println();
        for(Object x : items) {
            System.out.println(x + "\t");
            System.out.println();
            System.out.println(30);
            System.out.println(items);
        }
    }
}
