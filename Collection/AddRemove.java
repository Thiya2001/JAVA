import java.util.*;
public class AddRemove {
    public static void main(String[] args) {
        List<Object> bag = new ArrayList<>();
        bag.add(10);
        bag.add(20);
        bag.add(30);
        bag.add(40);
        bag.add(50);
        ListIterator<Object> i = bag.listIterator();
        i.add(0);
        System.out.println(bag);
        while(i.hasNext()) {
            i.next();
        }
        i.remove();
        System.out.println(bag);
    }
}
