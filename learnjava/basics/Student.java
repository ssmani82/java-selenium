package learnjava.basics;

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
	
	
	
public static void main(String [] Args) {
  Student sam = new Student("sam", "walter", 2003, 3.8);
  
  //Person sam = new Student("sam", "walter", 2003, 3.8);
  sam.print();
}
	
	

}
