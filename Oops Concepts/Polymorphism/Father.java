public class Father {
    public void singing() {
        System.out.println("I like to sing");
    }
    protected void marry() {
        System.out.println("Marry salman khan");
    }
}
class Katrina extends Father {
    public void marry() {
        System.out.println("I want to marry pranav");
    }
    public static void main(String[] args) {
        Father ref = new Katrina();
        ref.singing();
        ref.marry();
    }
}
