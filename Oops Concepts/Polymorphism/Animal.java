public class Animal {
    public Animal sound() {
        System.out.println("Animal make sound");
        return new Animal();
    }
}
class Human extends Animal {
    @Override
    public Human sound() {
        System.out.println("Human speaks");
        return new Human();
    }
}
class Dog extends Animal {
    public Dog sound() {
        System.out.println("Dog Borks");
        return new Dog();
    }
}
class AnimalZoo {
    public static void main(String[] args) {
        Animal ref = new Human();
        ref.sound();
    }
}
