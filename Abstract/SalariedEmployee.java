public class SalariedEmployee extends Employee
{
	private double salary; //annual

	public SalariedEmployee(String name, Date hireDate, double salary)
	{
		super(name, hireDate);
		this.salary = salary;
	}

	// setters and getters

	public boolean equals(Object obj)
	{
		if (obj instanceof SalariedEmployee) {
			return ((SalariedEmployee) obj).salary == salary;
		}
		return false;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", name=" + name + ", hireDate=" + hireDate + "]";
	}

	@Override
	public double getMonthlyPay() {
		return (salary/12.0);
	}

}