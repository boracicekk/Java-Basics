import java.security.PublicKey;
import java.util.Scanner;

public class WorkerClass {
private int amount;
private int balance=1000;
private static String name="Bora";

public static String username;
static boolean kontrol=true;
Scanner scanner= new Scanner(System.in);
public void setAmount() {
	this.amount=amount;
	System.out.println("Enter how much want to withdraw: ");
	amount=scanner.nextInt();
}


public String getName() {
	return name;
}
public void controlname() {
	System.out.println("Enter your name: ");
	username=scanner.nextLine();
	
	while(!kontrol) {
		break;
	}
	
	if(name.equals(username)) {
		System.out.println("******Please wait..******");
	 }
	else {
		System.out.println("No registered account found");
		
	 }
}
public void currency() {
	try {
		int islem=balance-amount;
		if(islem<0) 
		throw new IllegalArgumentException("Your current currency not enough");
		else {
			System.out.println("Succes...");
			System.out.println("Your current currency "+islem);
		}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
