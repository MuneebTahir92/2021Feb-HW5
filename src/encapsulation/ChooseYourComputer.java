package encapsulation;

public class ChooseYourComputer {

	public static void main(String[] args) {
		
		Computer macBookPro = new Computer();
		macBookPro.setScreenSize("15 inch");
		macBookPro.setHardDrive("16GB");
		macBookPro.setColor("Silver");
		macBookPro.setBatteryLife("20 hours");
		macBookPro.setNumberOfPorts(4);
		
		Computer macBookAir = new Computer();
		macBookAir.setScreenSize("13 inch");
		macBookAir.setHardDrive("8GB");
		macBookAir.setColor("Gray");
		macBookAir.setBatteryLife("15 hours");
		macBookAir.setNumberOfPorts(2);
		
		System.out.println(macBookPro.getScreenSize()+" "+ macBookPro.getHardDrive()+
		" "+macBookPro.getColor()+" "+macBookPro.getBatteryLife()+" "+macBookPro.getNumberOfPorts());
		
		System.out.println(macBookAir.getScreenSize()+" "+ macBookAir.getHardDrive()+
				" "+macBookAir.getColor()+" "+macBookAir.getBatteryLife()+" "+macBookAir.getNumberOfPorts());
		
	}

}
