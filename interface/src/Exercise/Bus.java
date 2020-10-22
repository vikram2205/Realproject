package Exercise;

public class Bus implements Vehicle{
	String color;
	int gears;
	int mileage;
	Engine engine;
	public Bus(String color, int gears, int mileage, Engine engine) {
		super();
		this.color = color;
		this.gears = gears;
		this.mileage = mileage;
		this.engine = engine;
	}
	@Override
	public void startVehicle(Vehicle V) {
		Bus b=(Bus)V;
		
		System.out.println("started vehicle");
	}
	@Override
	public void stopVehicle(Vehicle V) {
		Bus b=(Bus)V;
		System.out.println("Stopped vehicle");
		
	}
	public void Displaybus() {
		System.out.println("the details of the bus are:");
		System.out.println("COLOR :"+color+"\n"+"GEARS:"+gears+"\n"+"mileage : "+mileage+"\n"+"ENGINE:"+engine.engineHp);
	}
	

}
