public class HourlyEmployee extends Employee
{
	private double wageRate; 
	private double hours; //for the month

	public HourlyEmployee(String name, Date hireDate, double wageRate,
			double hours)
	{
		super(name, hireDate);
		this.wageRate = wageRate;
		this.hours = hours;
	}
	
	
	// setters and getters 

	public boolean equals(Object obj)
	{
		if (obj instanceof HourlyEmployee) {
			return ((HourlyEmployee) obj).wageRate == wageRate && ((HourlyEmployee) obj).hours == hours;
		}
		return false;
// …
	}

	@Override
	public String toString() {
		return "HourlyEmployee [wageRate=" + wageRate + ", hours=" + hours + ", name=" + name + ", hireDate=" + hireDate
				+ "]";
	}


	@Override
	public double getMonthlyPay() {
		return (wageRate*hours);
	}
	
}