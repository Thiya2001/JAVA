import java.util.*;
public class HashNext {
    public static void main(String[] args) {
        List<Object> bag = new ArrayList<>();
        bag.add(10);
        bag.add(null);
        bag.add(true);
        bag.add('A');
        bag.add("Hello");
        bag.add(10);
        bag.add(20);
        Iterator i = bag.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
