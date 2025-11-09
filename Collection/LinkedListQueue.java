import java.util.*;
public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<Object> queue = new LinkedList<>();
        System.out.println();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println(queue);

        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);

        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);

        while(!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.poll();
            System.out.println(queue);
        }
    }
}
