package Package;
public class Speed {
	 public Speed(){
		
	}
	void compareSpeed(int c) {
		if (c<250 && c<240 ) {
			System.out.println("Volvo ��� �������� �� BMW � Passat");
		}else if (c<250 && c>200) {
			System.out.println("Passat ��� ������ �� Volvo,��� �������� �� BMW");
		}else if(c>240 && c>200) {
			System.out.println("BMW ��� ������ �� Passat i Volvo");
		}
		
		
}
}
	
	


