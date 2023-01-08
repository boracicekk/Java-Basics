import java.util.Scanner;


public class Salarymain {

	public static void main(String[] args) {
	/*Salaryclass worker = new Salaryclass();
	worker.name = "Bora";
	worker.wage = 15;
	worker.workingHours = 9;
	worker.SecurityNumber=111000;
	worker.displayInfo();
	worker.displaySalary();
	*/
	Salaryclass worker1=new Salaryclass();
	Salaryclass worker2=new Salaryclass();

	Scanner scan = new Scanner(System.in);
	
	
	worker1.displayMessages();
	worker1.name = scan.nextLine();
	worker1.wage = scan.nextFloat();
	worker1.workingHours = scan.nextInt();
	worker1.SecurityNumber = scan.nextInt();
	worker1.displayInfo();
	worker2.displaySalary();
	}

		
}
