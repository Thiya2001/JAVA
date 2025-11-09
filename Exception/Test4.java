public class Test4 {
    public Test4() throws InterruptedException {
        System.out.println("Hi");
        Thread.sleep(2000);
        System.out.println("Bye");
    }
    public static void main(String[] args) {
        try {
            Test4 t = new Test4();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
