package _03_polymorphs;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageMorph extends Polymorph implements ImageObserver {
	
	static ImageIcon img;

	public ImageMorph(int x, int y, int w, int h) {
		super(x, y, w, h);
		try {
			img = new ImageIcon(
					ImageIO.read(new URL("https://imgs.xkcd.com/comics/1_to_10.png")));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		g.drawImage(img.getImage(), getX(), getY(), getWidth(), getHeight(), this);
	}
	
	@Override
	public void update() {
		
	}

	@Override
	public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
		return false;
	}

}
