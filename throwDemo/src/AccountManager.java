public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws Exception {
        if (balance >= amount) {
            balance = getBalance() - amount;
            System.out.println(" Deposit Successful.");
        } else if (balance < amount) {
            throw new Exception("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
