
public abstract class  Employee {
	String name_surname;
	int SSN; 
	public Employee(String n,int ssn) {
		this.name_surname = n;
		this.SSN = ssn;
	}

	abstract double earning();
	public String toString() {
		return name_surname +"  "+ SSN;
	} 
	
}
