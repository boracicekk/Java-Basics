import java.awt.image.BandCombineOp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(1, 500, "Bora");
		BankAccount a2 = new BankAccount(2, 1000, "İrem");
		BankAccount a3 = new BankAccount(3, 1500, "Rabia");
		BankAccount a4 = new BankAccount(4, 500, "Yasin");
		ArrayList<BankAccount>myAccounts=new ArrayList<>();
		myAccounts.add(a1);
		myAccounts.add(a2);
		myAccounts.add(a3);
		myAccounts.add(a4);
		Collections.sort(myAccounts);
		for (BankAccount bankAccount : myAccounts) {
			bankAccount.balanceChange(500);
		}
		/*Iterator<BankAccount> iter=myAccounts.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		*/
		for (BankAccount bankAccount : myAccounts) {
			System.out.println(bankAccount.holderNameString);
		}
		
		
		
		for (BankAccount bankAccount : myAccounts) {
			System.out.println(bankAccount.balance);
		}
	}
	
}
