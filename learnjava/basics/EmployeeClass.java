package learnjava.basics;

public class EmployeeClass {
	
	private String Name;
	int Age;
	
	public String  getname(){
		return Name;
	}
	
	public int getAge(){
		return Age;
	}
	
	public void Setname(String Name2){
		this.Name = Name2;
	}
	
	public void SetAge(int Age2){
		this.Age =  Age2;
	}
	
	
	//  No arg  Constructor
	EmployeeClass(){
		System.out.println("Inside my constructor");
	}
	
	/*
	 Single Argument Constructor
	EmployeeClass(String Name1){
		this.Name = Name1;
	}
	
	Multi Argument constructor
	EmployeeClass(String Name1,int Age1) {
		
		this.Name = Name1;
		this.Age = Age1;
		
	}*/
	
	
	/**
	 * @param Args
	 */
	public static void main(String [] Args) {
		
		
		EmployeeClass obj1 = new EmployeeClass();
		
		obj1.Name = "Raja";
				
	    System.out.println("Hello " + obj1.Name);
	    
	    EmployeeClass obj2 = new EmployeeClass();
	    String name = new String("Mark");
	    obj2.Setname(name);
	    obj2.SetAge(30);
	    
	    
	    
	    System.out.println(obj2.getname());
	    System.out.println(obj2.getAge());
	    
	    
	    /*EmployeeClass obj3 = new EmployeeClass("Mani" , 25);
	    System.out.println("Hello Mr." + obj3.Name + " your age is " + obj3.Age);*/      
	        		
		
				
	
	}

}
