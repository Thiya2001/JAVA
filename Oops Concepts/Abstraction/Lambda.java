@FunctionalInterface
public interface Lambda {
    void start();
}
class BMW {
    public static void main(String[] args) {
        Lambda ref = () -> {
            System.out.println("Car Start");
        };
        ref.start();
    }
}
