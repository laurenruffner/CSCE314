public class  Driver{
	
	
	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle airplane = new Airplane();
		
		car.forward();
		car.setMotor("combustion");
		airplane.setMotor("jet");
		
		System.out.println(car.getMotor() + " " + airplane.getMotor());
		
		((Airplane) airplane).setCountry("USA");
		System.out.println(((Airplane) airplane).getCountry());
		((Airplane) airplane).fireWeapon();
		
		((Car) car).accelerate();
		((Airplane) airplane).accelerate();
	}
}