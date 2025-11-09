import java.util.*;

public class HashTableCollection {
    public static void main(String[] args) {
        Hashtable<Object, Object> bag = new Hashtable<>();
        bag.put(10, "Hello");
        bag.put('a', 30);
        bag.put(true, 10.5);
        System.out.println(bag);
    }
}
