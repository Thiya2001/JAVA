public class BankAccount {
    private long accountno;
    private String accountholdername;
    private double balance;

    BankAccount(long accountno, String accountholdername, double balance) {
        this.accountno = accountno;
        this.accountholdername = accountholdername;
        this.balance = balance;
    }
    public long getAccno() {
        return accountno;
    }
    public String getAccHolderName() {
        return accountholdername;
    }
    public double getBalance() {
        return balance;
    }
    public void setAccHolName(String accountholdername) {
        this.accountholdername = accountholdername;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
