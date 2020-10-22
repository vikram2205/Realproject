package Exercise;

public class Car implements Vehicle {
	String color;
	int gears;
	int mileage;
	
	public Car(String color, int gears, int mileage) {
		super();
		this.color = color;
		this.gears = gears;
		this.mileage = mileage;
		
	}
	@Override
	public void startVehicle(Vehicle V) {
	Car b=(Car)V;
		
		System.out.println("started vehicle");
	}
	@Override
	public void stopVehicle(Vehicle V) {
		Car b=(Car)V;
		System.out.println("Stopped vehicle");
		
	}
	public void Displaybus() {
		System.out.println("the details of the car are:");
		System.out.println("COLOR :"+color+"\n"+"GEARS:"+gears+"\n"+"mileage : "+mileage+"");
	}
	

}



