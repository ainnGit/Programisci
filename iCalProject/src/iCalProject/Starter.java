package iCalProject;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Starter();
	}
	
	public Starter(){
		iCal cal = new iCal("Pierwszy", 1);
		iCal cal2 = new iCal("Drugi", 2);
		iCal cal3 = new iCal("Trzeci", 3);
		
		System.out.println("Pierwszy iCal.");
		cal.desc();
		
		System.out.println("Drugi iCal");
		cal2.desc();
		
		System.out.println("Trzeci iCal");
		cal3.desc();
	}
}
