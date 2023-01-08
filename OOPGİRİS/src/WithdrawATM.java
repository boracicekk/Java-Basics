import java.security.PublicKey;
import java.util.Scanner;

public class WithdrawATM {
	/*
	 You need to do the following modification in Account Class:

In order to withdraw money, there will be a set of conditions:

Set a password (for example 1234)

User will get a message: “Please enter the 4-digit pass:”

User must enter the pass using keyboard

If pass is true, the user will withdraw the money

If pass is wrong, the user will try again two more times.

If the pass is still wrong, the user will get another message:

“Your account has been blocked, please try again later”

Do them all in withdraw() Method
	 */
	public int password;
	public int TruePassword = 789;
	public int counter = 3;
	Scanner scanner = new Scanner(System.in);
		public void displayControl() {
		int password = scanner.nextInt();
			while(counter>1) {
				if(password==TruePassword) {
					System.out.println("Correct password.");
					break;
			}
				else {
				counter--;
				System.out.println("You have "+counter+" more attempts.");
				System.out.println("Enter your password:");
				password = scanner.nextInt();
				}
			}
			System.out.println("Your account has been blocked.\nSystem will shutdown...");
			
}
}