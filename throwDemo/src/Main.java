//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws BalanceInsufficentException{
    AccountManager am = new AccountManager();
    System.out.println("Total balance: " + am.getBalance());
    am.deposit(40);
    System.out.println("Total balance: " + am.getBalance());
        try {
            am.withdraw(50);
        } catch (Exception exception) {
            throw new BalanceInsufficentException("Insufficent balance!");
        }
        System.out.println(am.getBalance());
    }
}