abstract class Buhari {
    public abstract void biryani();
    public abstract void honeyChicken();
    public abstract void matarPanner();
    public abstract void payasam();
}
class chef extends Buhari {
    public void biryani() {
        System.out.println("Biryani");
    }
    public void honeyChicken() {
        System.out.println("Honey Chicken");
    }
    public void matarPanner() {
        System.out.println("Matter Panner");
    }
    public void payasam() {
        System.out.println("Payasam");
    }
}
class Pranav {
    public static void main(String[] args) {
        Buhari obj = new chef();
        obj.matarPanner();
        obj.payasam();
    }
}
