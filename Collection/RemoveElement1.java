import java.util.*;
public class RemoveElement1 {
    public static void main(String[] args) {
        List<Object> bag = new ArrayList<>();
        bag.add("Water");
        bag.add("Soda");
        bag.add("Ice");
        bag.add("Peanuts");
        bag.add("Glass");

        bag.remove("Peanuts");
        System.out.println(bag);

        bag.remove(2);
        System.out.println(bag);
    }
}
