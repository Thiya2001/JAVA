import java.util.*;
public class StackCollection {
    public static void main(String[] args) {
        Stack<Object> bag = new Stack<>();
        System.out.println(bag);
        bag.add(10);
        bag.add(20);
        bag.add(true);
        bag.add(10.5);
        bag.add("Hello");
        System.out.println(bag);

        System.out.println(bag.peek());

        bag.pop();
        System.out.println(bag);

        while(!bag.isEmpty()) {
            System.out.println(bag.peek());
            bag.pop();
            System.out.println(bag);
        }
    }
}
