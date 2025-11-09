public class Bag {
    Ball ref;

    public void addBall(Ball ball) {
        if(isBagEmpty()) {
            ref = ball;
            System.out.println("Ball added inside the bag");
        }
        else {
            System.out.println("Bag is already having a ball");
        }
    }
    public void removeBall() {
        if(isBagEmpty())
        System.out.println("No ball present");
        else {
            System.out.println("Ball is removed");
            ref = null;
        }
    }
    public boolean isBagEmpty() {
        return ref == null ? true : false;
    }
    public void showGame() {
        if(isBagEmpty()) {
            System.out.println("Bag is Empty");
        }
        else {
            String game = "";
            if(ref instanceof BasketBall) {
                BasketBall obj = (BasketBall)ref;
                game = obj.game;
            }
            else if(ref instanceof Tennis) {
                Tennis obj = (Tennis)ref;
                game = obj.game;
            }
            else if(ref instanceof Cricket) {
                Cricket obj = (Cricket)ref;
                game = obj.game;
            }
            System.out.println("Game : " + game);
            System.out.println("Radius : " + ref.getRadius());
        }
    }
}
