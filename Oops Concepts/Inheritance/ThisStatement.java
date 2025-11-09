public class ThisStatement {
    int a = 10;
    ThisStatement() {
        this(14);
        System.out.println("Java");
    }
    ThisStatement(int x) {
        this(14.5, "Hello");
        System.out.println("SQL");
    }
    ThisStatement(double y, String z) {
        this(true);
        System.out.println("Web Tech");
    }
    ThisStatement(boolean p) {
        System.out.println("Manual Testing");
    }
    public static void main(String[] args) {
        ThisStatement obj = new ThisStatement();
    }
}
