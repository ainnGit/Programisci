package iCalProject;

public class Starter {

	public static void main(String[] args) {
		
		new Starter();
	}
	
	public Starter(){
		iCal cal = new iCal("Pierwszy", 1);
		
		System.out.println("Pierwszy iCal.");
		cal.desc();
	}
}
