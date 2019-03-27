package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {

	private double angle;
	private int x;
	private int y;
	
	public CircleMorph(int x, int y, int w, int h) {
		super(x, y, w, h);
		this.x = x;
		this.y = y;
	}

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	@Override
	public void update() {
		angle+=0.5;
		setX((int) ( x+(Math.sin(angle)*50) ));
		setY((int) ( y+(Math.cos(angle)*50) ));
	}

}
