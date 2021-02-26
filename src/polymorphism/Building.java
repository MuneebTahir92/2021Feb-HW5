package polymorphism;

public class Building {

	public int sizeOfBuilding(int a, int b) {
		int total = a + b;
		
		return total;
	}
	
	public int sizeOfBuilding(int a, int b, int c) {
		int total = a + b + c;
		
		return total;
	}
	
	public int sizeOfBuilding(int a, int b, int c, int d) {
		int total = a + b + c + d;
		
		return total;
	}

}
