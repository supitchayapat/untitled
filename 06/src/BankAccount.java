public class BankAccount {
    private double balance;
    private String id;

    public BankAccount(int balance, String id) {
        this.balance = balance;
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
