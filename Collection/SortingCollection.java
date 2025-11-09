import java.util.*;
public class SortingCollection {
    public static void main(String[] args) {
        List<Double> bag = new ArrayList<>();
        bag.add(50.0);
        bag.add(30.0);
        bag.add(20.0);
        bag.add(40.0);
        bag.add(10.0);
        System.out.println(bag);
        Collections.sort(bag);
        System.out.println(bag);
    }
}
