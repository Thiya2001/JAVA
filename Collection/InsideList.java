import java.util.List;
import java.util.ArrayList;

public class InsideList {
    public static void main(String[] args) {
        List bag = new ArrayList<>();
        bag.add(10);
        bag.add(true);
        bag.add("Hello");
        bag.add('A');
        bag.add(null);
        bag.add(8.5);
        System.out.println(bag);

        bag.add(3, 19);
        System.out.println(bag);
    }
}
