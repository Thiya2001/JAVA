public class SimMain {
    public static void main(String[] args) {
        Sim s1 = new Sim("Airtel", "5G", 399.0);
        SimMobile m1 = new SimMobile("iphone 14", "Apple", 79999.0);
        m1.detailsOfSimMobile();
        m1.insertSim(s1);
        m1.detailsOfSimMobile();
        m1.removeSim();
        m1.detailsOfSimMobile();
    }
}
