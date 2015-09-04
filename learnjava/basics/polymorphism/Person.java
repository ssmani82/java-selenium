package learnjava.basics.polymorphism;

//this is the Base class or Parent Class for Inheritance. and Subclass or child class will be Student

public class Person {
	
	private String FirstName;
	private String LastName;
	
	
	public Person (String FN , String LN) {
		this.FirstName = FN;
	    this.LastName = LN;
	}

	public void print() {
		System.out.println("\t" + FirstName + " " + LastName );
	}
	
	
}
