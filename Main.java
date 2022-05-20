package Package;
public class Main {
	public static void main(String[] args) {
		Cars car=new Cars("BMW");
		Fuel fuel=new Fuel();
		Speed speed=new Speed();
		fuel.fuel(car);
		speed.compareSpeed(250);
	}

}
