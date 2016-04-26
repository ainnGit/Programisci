package iCalProject;

public class iCal {
	
	private String name;
	private int number;
	
	public iCal(String name, int number){
		this.name = name;
		this.number = number;
	}
	
	public void desc(){
		System.out.println("Name: " + name + ", number: " + number);
	}
}
