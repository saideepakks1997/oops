package inheritance_singlelevel;

public class GalaxyS12 extends SamsungMobile{
	double cameraPixel;
	String currentAndroidVersion;
	//Cost of the mobile
	public GalaxyS12(){
		this.modelName = this.getClass().getSimpleName();
		this.cost = 10000;
		this.cameraPixel = 32;
		this.currentAndroidVersion = "Snow cone";
		String color = "Black";
	}
	
	public void openCamera() {
		System.out.println(this.cameraPixel+"MP camera opened click capture button "
				+ "to capture the photo");
	}
	public void listenMusic() {
		System.out.println("Select the music to listen to music ");
	}
	public void browse() {
		System.out.println("Search thee content ");
	}
}
