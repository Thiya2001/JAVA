public interface Master {
    void speak();
}
class Trainer {
    public static void teach() {
        System.out.println("Teaching");
    }
    public static void main(String[] args) {
        Master obj = Trainer :: teach;
        obj.speak();
    }
}
