import java.util.*;
public class RemoveElement2 {
    public static void main(String[] args) {
        List<Object> bag = new ArrayList<>();
        bag.add("Water");
        bag.add("Soda");
        bag.add("Ice");
        bag.add("Peanuts");
        bag.add("Glass");
        System.out.println(bag);

        List<Object> bag2 = new ArrayList<>();
        bag2.add("Water");
        bag2.add("Soda");
        bag2.add("Ice");
        System.out.println(bag2);

        bag.removeAll(bag2);
        System.out.println(bag);
    }
}
