public class Engine {
    //States
    String type;
    double power;
    int stroke;

    Engine(String type, double power, int stroke) {
        //Load Instruction
        this.type = type;
        this.power = power;
        this.stroke = stroke;
    }
    //Behaviours
    public void detailsOfEngine() {
        System.out.println("Details of Engine : ");
        System.out.println("Type : " + type);
        System.out.println("Power : " + power);
        System.out.println("Stroke : " + stroke);
    }
}
