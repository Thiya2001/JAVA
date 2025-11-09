import java.util.*;
public class FindElement {
    public static void main(String[] args) {
        List<Object> bag = new ArrayList<>();
        bag.add(10);
        bag.add(20);
        bag.add(30);
        bag.add(40);
        bag.add(50);
        System.out.println(bag);
        System.out.println(bag.get(1));
        System.out.println(bag.get(3));
        System.out.println(bag.get(bag.size()-1));
    }
}
