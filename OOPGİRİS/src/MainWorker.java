import java.util.Scanner;

public class MainWorker {

	public static void main(String[] args) {
	WorkerClass obj = new WorkerClass();
	Scanner scan = new Scanner(System.in);
	System.out.println("Welcome to ATM");
	obj.controlname();
	obj.setAmount();
	obj.currency();
	
	
	}	

}
