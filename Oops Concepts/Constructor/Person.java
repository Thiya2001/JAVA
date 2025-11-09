public class Person {
    //States
    String name;
    int age;
    String partner;
    public Person() {
        name = "Gaja";
        age = 400;
        partner = "xyz";
    }
    public Person(String n, int a, String p) {
        name = n;
        age = a;
        partner = p;
    }
    public void sleep() {
        System.out.println("Sleeping");
    }
    public void eat() {
        System.out.println("Eating");
    }
}
