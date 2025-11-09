interface TrainingCenter1 {
    void teachTesting();
    void takePresentation();
}
interface TrainingCenter2 {
    void teachDevelopment();
    void coding();
}
class Trainer {
    public static void main(String[] args) {
        TrainingCenter1 obj = new TrainingCenter1() {
            public void teachTesting() {
                System.out.println("Gaja sir is teaching testing.");
            }
            public void takePresentation() {
                System.out.println("Gaja sir is taking presentation.");
            }
        };
        obj.teachTesting();
        obj.takePresentation();
        TrainingCenter2 obj1 = new TrainingCenter2() {
            public void teachDevelopment() {
                System.out.println("Pranav sir is teaching development.");
            }
            public void coding() {
                System.out.println("Developers are doing coding.");
            }
        };
        obj1.teachDevelopment();
        obj1.coding();
    }
}
