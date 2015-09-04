package learnjava.basics;

public class EmployeeInfo {
	
	String name;
	int age;
	Account account;
	Salary perk;
	Education Studies;
	
	EmployeeInfo(String name, int age){
		this.name = name;
		this.age  = age;
	}
	
	EmployeeInfo(String name, int age, Account acc , Salary perk, Education Studies){
		this.name = name;
		this.age  = age;
		this.account = acc;
		this.perk = perk;
		this.Studies = Studies;
		System.out.println(acc.accountnum);
		
	}
	
	public void setAccount(Account acc){
		this.account = acc;
	}
	
	public void setsalary(Salary sal){
		this.perk = sal;
	}
	
	public void setEducation(Education edu){
		this.Studies = edu;
	}
	
	public int getAccountNum(){
		return account.accountnum;
	}
	
	
	public int getIncome(){
		return perk.Income;
	}
	
	public static void main(String a[]){
		Account accobj  = new Account(1234);
		String name = new String("Raji"); // String name ="Raji";
		Salary sal = new Salary(100000);
		Education edu =  new Education();
		edu.setDegree(true);
		EmployeeInfo emp = new EmployeeInfo(name, 30, accobj,sal,edu);
		
		System.out.println(emp.age + "  years old  " + emp.name +  " Account num  : " + emp.getAccountNum() + 
				" with salary " + emp.getIncome() + " Degree hoding  :  " + emp.Studies.getDegree());
		
		
		
		EmployeeInfo maniobj = new EmployeeInfo("Mani", 33);
		Account acc2  = new Account(3456);
		Salary sal1 = new Salary(4500);
		Education edu1 = new Education();
		edu1.setDegree(false);
		
		maniobj.setAccount(acc2);
		maniobj.setsalary(sal1);
		maniobj.setEducation(edu1);
		
		System.out.println(maniobj.age + "  years old  " + maniobj.name +  " Account num  : " + maniobj.getAccountNum() + 
				" with salary " + maniobj.getIncome() + " Degree hoding : " + maniobj.Studies.getDegree());
		
		
	}
}

