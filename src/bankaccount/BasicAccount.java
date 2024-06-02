package bankaccount;

public class BasicAccount extends BankAccount {

    public BasicAccount(double balance) {
        super(balance);
    }

    public BasicAccount() {
    }

    public void withdraw(double amount){
        if(amount > getBalance()){
            System.out.println("not_available");
        }
        else{
            double remainingBalance = getBalance()-amount;

            System.out.println("yes,you can withdraw your amount");

            System.out.println(remainingBalance);
        }

    }


}
