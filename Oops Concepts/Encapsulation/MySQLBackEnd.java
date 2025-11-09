public class MySQLBackEnd {
    public static void main(String[] args) {
        MySQL sql1 = MySQL.connectDatabase();
        MySQL sql2 = MySQL.connectDatabase();
        MySQL sql3 = MySQL.connectDatabase();

        System.out.println(sql1);
        System.out.println(sql2);
        System.out.println(sql3);
    }
}
