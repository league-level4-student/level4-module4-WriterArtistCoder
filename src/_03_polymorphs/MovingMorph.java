package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {

	public MovingMorph(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(0, 100, 0));
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		setX(getX()+3);
	}

}
