package encapsulation;

public class Computer {
	
	// these data fields are private
	// only way to access them is through get/set method and also constructors
	private String screenSize;
	private String hardDrive;
	private String color;
	private String batteryLife;
	private int numberOfPorts;
		
	public Computer() {}
		
	public Computer(String screenSize, String hardDrive, String color, String batteryLife, int numberOfPorts) {
		this.screenSize = screenSize;
		this.hardDrive = hardDrive;
		this.color = color;
		this.batteryLife = batteryLife;
		this.numberOfPorts = numberOfPorts;
	}
		
		
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public String getHardDrive() {
		return hardDrive;
	}
	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBatteryLife() {
		return batteryLife;
	}
	public void setBatteryLife(String batteryLife) {
		this.batteryLife = batteryLife;
	}
	public int getNumberOfPorts() {
		return numberOfPorts;
	}
	public void setNumberOfPorts(int numberOfPorts) {
		this.numberOfPorts = numberOfPorts;
	}

}
