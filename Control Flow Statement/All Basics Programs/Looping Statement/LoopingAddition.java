public class LoopingAddition {
    public static int add(int... a) {
        int sum = 0;
        for(int x : a)
        sum = sum + x;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum : " + add(10, 20, 30, 40, 50, 60, 70, 80, 90));
    }
}
