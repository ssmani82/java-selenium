package learnjava.basics.polymorphism;

public class Student extends Person {
	
	private  int GradYear;
	private double GPA;
	
	public  Student (String FN,  String LN, int GY , double GPA) {
		
		super(FN, LN);
		
		this.GPA = GPA;
		this.GradYear = GY;
		
	}
	
	public void print(){
		super.print();
		System.out.println("Grade Year  " + GradYear + " GPA : " + GPA);
		
	}
	
	public void printmarks(){
		print();
		System.out.println("  Markes are printed");
	}
	
	
	
public static void main(String [] Args) {
  
  Person sam = new Student("sam", "walter", 2003, 3.8);
  sam.print();
  //sam.printmarks(); // compile time polymorphism
  
  Student raji = new Student("raji", "m", 2003, 3.8);
  raji.printmarks();
  
  
}
	
	

}
