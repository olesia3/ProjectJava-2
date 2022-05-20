package Package;
public class Fuel {
	int fl1;
	int fl2;
	int fl3;
	public Fuel() {
		super();
	}
	void fuel(Cars a) {
		if (a.name.equalsIgnoreCase("Passat")) {
			fl1=9;
			fl2=10;
			System.out.println("Pозхід палива Passat: "+fl1);
			if (fl1<fl2) {
				System.out.println("Passat буде мати менший розхід ніж Volvo");
			}
		} else if (a.name.equalsIgnoreCase("Volvo")) {
			fl2=10;
			System.out.println("Pозхід палива Volvo: "+fl2);
			if (fl2>fl1) {
				System.out.println("Volvo буде мати більший розхід ніж Passat");
			}
		} else if (a.name.equalsIgnoreCase("BMW")) {
			fl3=11;
			System.out.println("Pозхід палива BMW: "+fl3);
			if (fl3>fl2) {
				System.out.println("BMW  буде мати більший розхід ніж Volvo");
			}
		}
		
		
	}
}
