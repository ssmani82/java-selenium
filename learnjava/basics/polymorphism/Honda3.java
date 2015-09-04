package learnjava.basics.polymorphism;

class Bike {
	int speedlimit = 90;
	
	public void  printSpeed(){
		System.out.println(" Speed " + speedlimit);
	}
	
}

class Honda3 extends Bike {
	int speedlimit = 150;
	
	public void printSpeed(){
		System.out.println(" Speed " + speedlimit);
	}

	public static void main(String args[]) {
		Bike obj = new Honda3();
		System.out.println(obj.speedlimit);// 90
		
		obj.printSpeed();
	}

}