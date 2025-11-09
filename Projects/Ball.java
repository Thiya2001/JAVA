public class Ball {
    private double radius;
    Ball(double radius) {
        //Load instruction
        this.radius = radius;
    }
    //getter
    public double getRadius() {
        return radius;
    }
    //setter
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
class BasketBall extends Ball {
    String game = "Basket-ball";
    BasketBall(double radius) {
        super(radius);
    }
}
class Tennis extends Ball {
    String game = "Tennis";
    Tennis(double radius) {
        super(radius);
    }
}
class Cricket extends Ball {
    String game = "Cricket";
    Cricket(double radius) {
        super(radius);
    }
}

