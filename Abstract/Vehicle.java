public abstract class Vehicle 
{
	protected float speed;
	protected String motor;
	protected String country;
	
	public abstract String getMotor();
	public abstract void setMotor(String motor);
	
	protected float getSpeed() { return speed; }
	protected void setSpeed(float speed) { this.speed = speed; }

	protected void left() { System.out.println("left"); } ;
	protected void right() { System.out.println("right"); } ;
	protected void forward() { System.out.println("forward"); } ;
	protected void reverse() { System.out.println("backward"); } ;
}