public class Car extends Vehicle implements Engine{
	private String licensePlate;
	//private String motor;

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
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

	@Override
	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		super.motor = motor; 
	}

	@Override
	public void accelerate() {
		System.out.println("2 seconds");
		
	}

	
	
}