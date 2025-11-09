interface RBI {
    void setInterestRate();
}
interface KYC {
    void updateKYC();
}
interface Loan {
    void updateKYC();
    void checkLoan();
}
class Bank implements RBI, Loan, KYC {
    Bank() {
        super();
    }
    public void setInterestRate() {
        System.out.println("Interest rate is 7%");
    }
    public void checkLoan() {
        System.out.println("Not eligible for Loan");
    }
    public void updateKYC() {
        System.out.println("KYC Updated");
    }
}
class Main {
    public static void main(String[] args) {
        RBI r = new Bank();
        r.setInterestRate();
        KYC k = new Bank();
        k.updateKYC();
        Loan l = new Bank();
        l.checkLoan();
        l.updateKYC();
    }
}