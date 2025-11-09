public class Looping1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Traversing through index :");
        for(int i=0;i<arr.length;i++) {
            System.out.println(i);
        }
        System.out.println("Traversing through values :");
        for(int x : arr) {
            System.out.println(x);
        }
    }
}
