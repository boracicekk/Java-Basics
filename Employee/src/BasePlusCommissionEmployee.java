
public class BasePlusCommissionEmployee extends CommissionEmployee {
	double baseSalary;
	public BasePlusCommissionEmployee(String n,int ssn,double commissionRate,double grossSales,double baseSalary) {
		super(n, ssn, commissionRate, grossSales);
		this.baseSalary=baseSalary;
	}
@Override
double earning() {
	return super.earning() + this.baseSalary;
}
}
