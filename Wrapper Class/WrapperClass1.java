public class WrapperClass1 {
    public static void main(String[] args) {
        int a = 10;

        Integer obj1 = Integer.valueOf(a);
        System.out.println(obj1);

        int res1 = obj1.intValue();
        System.out.println(res1);

        boolean b = true;

        Boolean obj2 = Boolean.valueOf(b);
        System.out.println(obj2);

        boolean res2 = obj2.booleanValue();
        System.out.println(res2);

        char c = 'A';

        Character obj3 = Character.valueOf(c);
        System.out.println(obj3);

        char res3 = obj3.charValue();
        System.out.println(res3);
    }
}