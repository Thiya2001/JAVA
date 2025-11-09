interface Message {
    void display(String msg);
}
class Demo {
    public void Show(String msg) {
        System.out.println(msg);
    }
}
class Phone {
    public static void main(String[] args) {
        Demo d = new Demo();
        Message ref = d :: Show;
        ref.display("Hello");
    }
}

