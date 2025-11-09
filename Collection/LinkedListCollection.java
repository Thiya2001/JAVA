import java.util.*;
public class LinkedListCollection {
    public static void main(String[] args) {
        List<Object> bag = new LinkedList<>();
        System.out.println(bag);
        bag.add(10);
        bag.add(20);
        bag.add(true);
        bag.add(20.5);
        System.out.println(bag);

        List<Integer> items = new LinkedList<>();
        items.add(10);
        items.add(20);
        items.add(null);
        items.add(10);

        for(Integer x : items) {
            System.out.println(x + "\t");
        }
        System.out.println();

        items.add(2, 100);
        System.out.println(items);
        System.out.println(items.get(2));
        System.out.println(items.contains(70));

        items.remove(3);
        System.out.println(items);

        Collections.sort(items);
        ListIterator i = items.listIterator();
        while(i.hasNext())
        System.out.println(i.next() + "\t");
    }
}
