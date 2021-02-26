package inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		
		Truck truck1 = new Truck();
		
		// following are from Car superclass
		truck1.wheels();
		truck1.windows();
		
		// following are from Truck subclass (Single inheritance)
		truck1.stickShift();
		truck1.bigHorn();
		
		// following is from Automobile class (Multilevel inheritance)
		truck1.doors();
		
		// following is from Technology interface
		truck1.newTechnology();
		
		// both Car class and Limo class extend the Automobile class (Hierarchical inheritance)
	}

}
