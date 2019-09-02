public class Airplane extends Vehicle implements Warplane, Engine{
	private String flightNumber;
	private String company;
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void left() {
		super.left();
	}
	
	public void right() {
		super.right();
	}
	
	public void forward() {
		super.forward();
	}
	
	public void reverse() {
		super.reverse();
	}
	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		super.motor = motor; 
	}
	
	public void setCountry(String c) {
		country = c;
		
	}

	public String getCountry() {
		return country;
	}
	
	public void fireWeapon() {
		System.out.println("WEAPON");
		
	}
	@Override
	public void accelerate() {
		System.out.println("0.5 seconds");
		
	}
	
	
	
	

	
}