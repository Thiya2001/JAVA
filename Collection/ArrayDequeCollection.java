import java.util.*;
import java.util.ArrayDeque;
public class ArrayDequeCollection {
    public static void main(String[] args) {
        Deque<Object> queue = new ArrayDeque<>();
        queue.offerLast(10);
        queue.offerLast(20);
        queue.offerLast(30);
        System.out.println(queue);

        queue.offerFirst(0);
        System.out.println(queue);

        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());

        queue.pollLast();
        System.out.println(queue);

        queue.pollFirst();
        System.out.println(queue);
    }
}
