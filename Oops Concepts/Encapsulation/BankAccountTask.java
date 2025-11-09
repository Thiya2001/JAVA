public class BankAccountTask {
    public static void main(String[] args) {
        BankAccount per1 = new BankAccount(918223782, "Arun", 13000.00);
        System.out.println("AccNo : " + per1.getAccno());
        System.out.println("AccHolName : " + per1.getAccHolderName());
        System.out.println("Balance : " + per1.getBalance());
        per1.setAccHolName("Sanjay");
        per1.setBalance(18300.00);
        System.out.println("AccNo : " + per1.getAccno());
        System.out.println("AccHolName : " + per1.getAccHolderName());
        System.out.println("Balance : " + per1.getBalance());
    }
}
