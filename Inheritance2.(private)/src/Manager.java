
public class Manager extends Employee{
	private int numofemployees;
	public Manager(String name,String department,int salary,int numofemployees) {
		super(name, department, salary);
		this.numofemployees=numofemployees;
	}
	public void raiseSalary(int amount) {
		System.out.println("Çalışanlara " +amount+" tl zam yapıldı...");
	}
	@Override
	public void showInfos() {
		super.showInfos();
		System.out.println("Sorumlu kişi sayısı: "+this.numofemployees);
	}
	
}
