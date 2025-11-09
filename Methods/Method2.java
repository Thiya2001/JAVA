class method2 {
    public static void main(String[] args) {
        System.out.println("Start");
        wish("Rahul" , 25);
        System.out.println("Hi Bro");
        System.out.println("End");
        return;
    }
    public static void wish(String s, int age) {
        System.out.println(s + " is " + age + " years old.");
        liftDumbles(10.5f);
        return;
    }
    public static void liftDumbles(float a) {
        System.out.println("Lifting Dumbles of : " + a + " Kg");
    }
}
