
public class SalariedEmployee extends Employee {
	double wage;
	int weeklySalary;
	public SalariedEmployee(String n,int ssn,int wage,int weeklySalary) {
		super(n, ssn);
		this.wage=wage;
		this.weeklySalary=weeklySalary;
	}
@Override
double earning() {
	wage = weeklySalary * 4;
	return wage;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+"  "+weeklySalary;
}
}
