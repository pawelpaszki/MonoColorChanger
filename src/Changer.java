import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Changer {

	public static void main(String[] args) {

		new Changer();
	}
	
	public Changer() {
		String path = "/home/pawel/Desktop/icon.png";
		File file = new File(path);
		BufferedImage loadedImage = null;
		try {
			loadedImage = ImageIO.read(file);
			Color color = new Color(77,254,21);
			for(int x = 0; x < loadedImage.getWidth(); x++) {
				for(int y = 0; y < loadedImage.getWidth(); y++) {
					if(loadedImage.getRGB(x, y) != 0) {
						loadedImage.setRGB(x, y, color.getRGB());
					}
				}
			}
			File outputfile = new File("/home/pawel/Desktop/changed.png");
				ImageIO.write(loadedImage, "png", outputfile);
		} catch (Exception e) {
			
		}
	}

}
