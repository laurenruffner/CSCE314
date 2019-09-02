public abstract class Employee
{
	protected String name;
	protected Date hireDate;

	public abstract double getMonthlyPay();
	// abstract since this method will be defined differently in the sub classes
	// both sub-class definitions need to return a double and be of the same name
	
	
	public Employee(String name, Date hireDate)
	{
		this.name = name;
		this.hireDate = hireDate;
	}

	public boolean samePay(Employee other)
	{
		return (this.getMonthlyPay() == other.getMonthlyPay());
	}

// setters and getters

	
	
	public boolean equals(Object obj)
	{
		if (obj instanceof Employee) {
			return ((Employee) obj).name == name && ((Employee) obj).hireDate == hireDate;
		}
		return false;
	}


	public String getName() {
		return name;
	}


	public Date getHireDate() {
		return hireDate;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
}