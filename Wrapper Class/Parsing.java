public class Parsing {
    public static void main(String[] args) {
        String s = "10";

        byte a = Byte.parseByte(s);
        System.out.println(a);

        short b = Short.parseShort(s);
        System.out.println(b);

        int c = Integer.parseInt(s);
        System.out.println(c);

        long d = Long.parseLong(s);
        System.out.println(d);

        float e = Float.parseFloat(s);
        System.out.println(e);

        double f = Double.parseDouble(s);
        System.out.println(f);

        String ss = "true";

        boolean g = Boolean.parseBoolean(ss);
        System.out.println(g);
    }
}
