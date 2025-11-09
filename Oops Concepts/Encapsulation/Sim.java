public class Sim {
    //States
    private String company;
    private String network;
    private double price;

    //Constructor
    Sim(String company, String network, double price) {
        this.company = company;
        this.network = network;
        this.price = price;
    }

    //Getters
    public String getCompany() {
        return company;
    }
    public String getNetwork() {
        return network;
    }
    public double getPrice() {
        return price;
    }

    //Setters
    public void setCompany(String company) {
        this.company = company;
    }
    public void setNetwork(String network) {
        this.network = network;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //Behaviours
    public void detailsOfSim() {
        System.out.println("Details Of Sim : ");
        System.out.println("Company : " + company);
        System.out.println("Network : " + network);
        System.out.println("Price : " + price);
    }
}
