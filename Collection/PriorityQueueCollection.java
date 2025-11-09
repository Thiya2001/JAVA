import java.util.*;
public class PriorityQueueCollection {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(40);
        queue.offer(20);
        queue.offer(50);
        queue.offer(10);
        queue.offer(60);
        queue.offer(20);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        queue.offer(0);

        while (!queue.isEmpty()) {
            System.out.println(queue);
            queue.poll();
        }
    }
}
