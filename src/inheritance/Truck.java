package inheritance;

public class Truck extends Car implements Technology {
	
	public void stickShift() {
		System.out.println("Does not work on automatic");
	}
	
	public void bigHorn() {
		System.out.println("Cover your ears. The horn is very loud");
	}
	
	public void newTechnology() {
		System.out.println("Let's make a hybrid truck");
	}

}
