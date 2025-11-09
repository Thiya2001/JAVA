public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 8 , y = 12, z = 10;
        x = x++ + --y - ++x + y--;
        y = --y + x++ - x + y;
        z = --x + ++x - y-- + x++;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
