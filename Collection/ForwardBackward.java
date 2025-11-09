import java.util.*;
public class ForwardBackward {
    public static void main(String[] args) {
        List<Object> bag = new ArrayList<>();
        bag.add(10);
        bag.add(20);
        bag.add(30);
        bag.add(40);
        bag.add(50);
        ListIterator<Object> i = bag.listIterator();
        System.out.println("\t Forward direction");
        while(i.hasNext()) {
            System.out.print(i.next() + "\t");
        }
        System.out.println();
        System.out.println("\t Backward direction");
        while (i.hasPrevious()) {
            System.out.print(i.previous() + "\t");
        }
    }
}
