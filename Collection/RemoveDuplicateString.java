import java.util.*;
public class RemoveDuplicateString {
    public static void main(String[] args) {
        String s = "Programmer";
        Set<Object> res = new LinkedHashSet<>();
        for (char x : s.toCharArray()) {
            res.add(x);
        }
        String result = " ";
        for(Object o : res) {
            result = result + o;
        }
        System.out.println(result);
    }
}
