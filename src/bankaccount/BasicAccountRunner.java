package bankaccount;

public class BasicAccountRunner {
    public static void main(String[] args) {
        BasicAccount basicAccount = new BasicAccount(8999);
        basicAccount.withdraw(900);
        System.out.println(basicAccount.getBalance());
    }
}
