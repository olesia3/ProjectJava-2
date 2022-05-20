package Package;
public class Cars {
	String name;
	 int speed1;
	 int speed2;
	 int speed3;
	public Cars(String name) {
		this.name=name;
		if (this.name.equalsIgnoreCase("Passat")) {
			this.speed1=240;
		}else if(this.name.equalsIgnoreCase("Volvo")) {
			this.speed2=200;
		} else if(this.name.equalsIgnoreCase("BMW")) {
			this.speed3=250;
		}
		
	}
}
