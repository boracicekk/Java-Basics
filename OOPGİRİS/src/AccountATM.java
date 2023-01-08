import java.util.Scanner;

public class AccountATM {

	public static void main(String[] args) {
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
		WithdrawATM costumer = new WithdrawATM();
		System.out.println("Please enter your password: ");
		costumer.displayControl();
		
	}

}
