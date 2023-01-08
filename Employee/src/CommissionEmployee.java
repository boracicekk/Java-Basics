
public class CommissionEmployee extends Employee {
	double commissionRate;
	double grossSales;
	public CommissionEmployee(String n,int ssn,double commissionRate,double grossSales) {
		super(n, ssn);
		this.commissionRate=commissionRate;
		this.grossSales=grossSales;
	}
@Override
double earning() {
	return commissionRate*grossSales;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+"gross sales :"+ grossSales + "commisson rate: "+ commissionRate;
}
}
