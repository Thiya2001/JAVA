import java.util.*;
public class ModifyElement {
    public static void main(String[] args) {
        List<Object> bag = new ArrayList<>();
        bag.add(10);
        bag.add(20);
        bag.add(30);
        bag.add(40);
        bag.add(50);
        System.out.println(bag);
        bag.set(2, 300);
        System.out.println(bag);
    }
}
