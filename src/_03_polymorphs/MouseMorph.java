package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;

public class MouseMorph extends Polymorph {

	public MouseMorph(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	@Override
	public void update() {
		Point m = MouseInfo.getPointerInfo().getLocation();
		if (getX() < m.getX()) {
			setX(getX()+5);
		} else {
			setX(getX()-5);
		}
		
		if (getY() < m.getY()) {
			setY(getY()+5);
		} else {
			setY(getY()-5);
		}
	}

}
