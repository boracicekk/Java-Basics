public class Main {

	public static void main(String[] args) {
		Employee employee1 = new HourlyEmployee("Bora Çiçek", 777777, 40, 5000);
		Employee employee2 = new SalariedEmployee("Rabia Osko", 888888, 41, 9900);
		Employee employee3 = new CommissionEmployee("Yasin Dırmıkçı", 9999, 70, 0.1);
		Employee employee4 = new BasePlusCommissionEmployee("İrem Kartal", 10000, 8000, 0.2, 5000);
		Employee[] employees = new Employee[] {employee1,employee2,employee3,employee4};
		for(Employee i : employees) {
			System.out.println(i + " salary " + i.earning());
		}

	}

}
