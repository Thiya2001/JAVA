interface Database {
    void connect();
}
class MySQL {
    public void connecting() {
        System.out.println("Connected to MySQL database");
    }
    public static void main(String[] args) {
        MySQL sql = new MySQL();
        Database ref = sql :: connecting;
        ref.connect();
    }
}
