
public class Employee {
private String name;
private String department;
private int salary;
	public Employee(String name,String department,int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public void showInfos() {
		System.out.println("Bilgiler...");
		System.out.println("İsim: "+name);
		System.out.println("İsim: "+department);
		System.out.println("İsim: "+salary);
	}
}
