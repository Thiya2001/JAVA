public class Person extends Object {
    String name;
    int age;
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Person p1 = new Person("Gaja", 30);
        System.out.println(p1);
        System.out.println(p1.toString());
    }
}