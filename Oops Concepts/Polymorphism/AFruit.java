public class AFruit {
    public AFruit getFruit() {
        System.out.println("Generic Fruit");
        return new AFruit();
    }
}
class Mango extends AFruit {
    @Override
    public Mango getFruit() {
        System.out.println("Return Mango");
        return new Mango();
    }
}
class Apple extends AFruit {
    public Apple getFruit() {
        System.out.println("Return Apple");
        return new Apple();
    }
}
class ABasket {
    public static void main(String[] args) {
        AFruit ref = new Mango();
        ref.getFruit();
        Mango ref1 = new Mango();
        Mango obj = new Mango();
    }
}
