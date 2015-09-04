package Inheritance;

public class ExceptionClassTest {
  
	
	public static void main(String[] args) {
		
		ExcpetionSample exp = new ExcpetionSample();
		
		
		try {
			exp.Method(0);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				
		
		

	}

}
