package Inheritance;

public class ExcpetionSample {
	
	public void Method(int Num) throws NotFoundException {
		
		if (Num == 0)  {
			
			NotFoundException e = new NotFoundException();
			
			throw e;			
		}
				
			
		
	}
	
	
	

}
