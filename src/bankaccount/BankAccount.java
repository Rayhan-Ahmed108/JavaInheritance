package bankaccount;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public BankAccount(){
        balance=0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
