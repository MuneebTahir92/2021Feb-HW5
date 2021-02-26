package polymorphism;

public class TestBuilding {

	public static void main(String[] args) {
		
		Building skyscraper = new Building();
		
		System.out.println("The world's tallest building is: "+skyscraper.sizeOfBuilding(675, 675, 675, 675)+" feet tall");
		
		System.out.println("The second tallest building is: "+skyscraper.sizeOfBuilding(700, 700, 700)+" feet tall");
		
		System.out.println("The third tallest building is: "+skyscraper.sizeOfBuilding(1000, 1000)+" feet tall");
		
		System.out.println(" ");
		
		Extension skyHigh = new Extension();
		
		System.out.println("After construction, the tallest building will be: "+skyHigh.sizeOfBuilding(675, 675, 675, 675));
	}

}
