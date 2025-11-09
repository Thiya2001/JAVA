public class SimMobile {
    //States
    private String name;
    private String brand;
    private double price;
    private Sim slots;

    //Constructor
    SimMobile(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
    public Sim getSim() {
        return slots;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //Behaviours
    public void insertSim(Sim sim) {
        if(isSlotsEmpty()) {
            this.slots = sim;
            System.out.println("Sim Inserted in the Phone");
        }
        else {
            System.out.println("Sim Already Exists");
        }
    }
    public void removeSim() {
        if(isSlotsEmpty()) {
            System.out.println("No Sim Exists");
        }
        else {
            System.out.println("Sim Removed from the Mobile");
            this.slots = null;
        }
    }
    public boolean isSlotsEmpty() {
        return slots == null;
    }
    public void detailsOfSimMobile() {
        System.out.println("Details Of Sim Mobile : ");
        System.out.println("Name : " + name);
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        if(!isSlotsEmpty()) {
            slots.detailsOfSim();
        }
        else {
        System.out.println("Invalid Input");
        }
    }
}
