package abstraction;

public abstract class Computer implements Device {
	
	public void typeKeys() {
		System.out.println("You are able to type using a keyboard");
	}
	
	public void internet() {
		System.out.println("You can surf the web");
	}
	
	public void watchVideos() {
		System.out.println("Watch any movie you want");
	}
	
	public abstract void takePictures();

}
