package Inheritance;

public class JunitTesting {
		
	public int sum(int a,int b)  {
		
		int c= a+b;
		
		return c;
	}

	
	public int countA(String word) {
		
		int count = 0;
				
				for (int i= 0 ;i<word.length(); i++) {
					
					if (word.charAt(i)=='a' || word.charAt(i)=='A'){
						
						count++;
					}
					
				}
				return count;
				
			
	}
}
