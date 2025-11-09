public class AC {
    String company;
    double price;
    boolean isWorking;

    AC(String company, double price, boolean isWorking) {
        this.company = company;
        this.price = price;
        this.isWorking = isWorking;
    }
    public String toString(){
        return "Company : " + company + " - Price : " + price + " - Is Working : " + isWorking;
    }
    public static void  main(String args[]) {
        AC obj = new AC("Blue Star", 10, false);
        System.out.println(obj.toString());
        System.out.println(obj);
    }
}
