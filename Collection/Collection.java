import java.util.*;
public class Collection {
    public static void main(String[] args) {
        List<Object> bag1 = new ArrayList<>();
            bag1.add("History");
            bag1.add("Maths");
            bag1.add("Science");

        List<Object> bag2 = new ArrayList<>();
            bag2.add("Java");
            bag2.add("SQL");
            bag2.add("Web Tech");

            System.out.println(bag1);
            System.out.println(bag2);

            bag2.addAll(bag1);
            System.out.println(bag2);
    }
}
