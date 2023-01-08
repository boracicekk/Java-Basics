
public class HourlyEmployee extends Employee {
	int hours;
	double wage;
	public HourlyEmployee(String n,int ssn,int hours,int wage) {
		super(n, ssn);
		this.hours = hours;
		this.wage=wage;
	}
@Override
double earning() {
	if (hours<=40) {
		return wage*hours;
}
	else {
		return 40*wage*(hours-40)*wage*1.5;
	}
}
@Override
public String toString() {
	
	return super.toString() + wage + hours;
}
}
