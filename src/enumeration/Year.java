package enumeration;

public class Year {
	
	Month month;
	
	public Year() {}
	
	public Year(Month month) {
		this.month = month;
	}
	
	public void whatIsTheWeather() {
		switch(month) {
		
		case January:
			System.out.println("It is still cold outside. Snow is falling.");
			break;
		case February:
			System.out.println("It is slowly becoming less cold.");
			break;
		case March:
			System.out.println("Spring is here. The sun is coming out to melt the snow.");
			break;
		case April:
			System.out.println("A lot of rain. Take an umbrella.");
			break;
		case May:
			System.out.println("The flowers are blooming.");
			break;
		case June:
			System.out.println("Summer is here. No need to wear a jacket.");
			break;
		case July:
			System.out.println("The sun is out. Let's go to the beach.");
			break;
		case August:
			System.out.println("The sun is slowly going away.");
			break;
		case September:
			System.out.println("Fall is here. The sun is slowly going away.");
			break;
		case October:
			System.out.println("All the leaves are falling.");
			break;
		case November:
			System.out.println("It is starting to get a little cold.");
			break;
		case December:
			System.out.println("Winter is here. Wear your jackets.");
			break;
		default:
			System.out.println("This month does not exist.");
		}
	}

}
