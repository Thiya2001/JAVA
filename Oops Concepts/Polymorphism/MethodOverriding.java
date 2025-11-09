public class MethodOverriding {
    public void chess() {
        System.out.println("Likes to play chess");
    }
    public void food() {
        System.out.println("I like Non-Veg");
    }
}
class B extends MethodOverriding {
    public void food() {
        System.out.println("I like Veg food");
    }
    public static void main(String[] args) {
        MethodOverriding ref = new B();
        ref.chess();
        ref.food();
    }
}