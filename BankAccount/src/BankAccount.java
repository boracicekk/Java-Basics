
public class BankAccount implements Comparable<BankAccount> {
int accountNo;
double balance;
String holderNameString;
public BankAccount(int accountNo,double balance,String holderName) {
	this.accountNo = accountNo;
	this.balance =balance;
	this.holderNameString = holderName;
}
double balanceChange(double amount) {
	return balance-=amount;
}
@Override
/*public int compareTo(BankAccount o) {
	return this.holderNameString.compareTo(o.holderNameString);
}
*/
public int compareTo(BankAccount o) {
	return (int)(this.balance-o.balance);
}

}
