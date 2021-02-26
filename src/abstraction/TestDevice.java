package abstraction;

public class TestDevice {

	public static void main(String[] args) {
		
		Device iPhone10 = new iPhone();
		iPhone10.internet();
		iPhone10.typeKeys();
		
		Computer iPhone11 = new iPhone();
		iPhone11.watchVideos();
		iPhone11.takePictures();
		
		iPhone iPhone12 = new iPhone();
		iPhone12.playGames();
		
	}

}
