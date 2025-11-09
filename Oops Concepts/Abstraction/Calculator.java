interface Add {
    int opp(int a, int b);
}
interface Sub {
    int opp(int a, int b);
}
interface Mul {
    int opp(int a, int b);
}
interface Div {
    int opp(int a, int b);
}
public class Calculator {
    public static void main(String[] args) {
        Add addition = (a,b) -> {return a+b;};
        Sub subtraction = (a,b) -> {return a-b;};
        Mul multiplication = (a,b) -> {return a*b;};
        Sub division = (a,b) -> {return a/b;};

        System.out.println("Addition : " + addition.opp(10,20));
        System.out.println("Subtraction : " + subtraction.opp(10,20));
        System.out.println("Multiplication : " + multiplication.opp(10,20));
        System.out.println("Division : " + division.opp(10,20));
    }
}
