import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
public class EmptyList {
    public static void main(String[] args) {
        List bag1 = new ArrayList();
        System.out.println(bag1);

        List bag2 = new LinkedList();
        System.out.println(bag2);

        List bag3 = new Vector();
        System.out.println(bag3);

        List bag4 = new Stack();
        System.out.println(bag4);
    }
}