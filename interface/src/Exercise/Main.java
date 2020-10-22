package Exercise;

public class Main {
	public static void main(String args[]) {
		Engine e=new Engine(534);
		Bus b=new Bus("skyblue",45,22,e);
		b.startVehicle(b);
		b.Displaybus();
		Car c=new Car("green",45,22);
		c.startVehicle(c);
		c.Displaybus();
		
		
		
	}

}