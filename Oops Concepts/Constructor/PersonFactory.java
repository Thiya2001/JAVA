public class PersonFactory {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.partner);

        Person p2 = new Person("Pranav", 60, "Java");
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.partner);

        Person p3 = new Person("Karthick", 24, "Semala");
        System.out.println(p3.name);
        System.out.println(p3.age);
        System.out.println(p3.partner);

        p1.sleep();
        p2.eat();
    }
}
