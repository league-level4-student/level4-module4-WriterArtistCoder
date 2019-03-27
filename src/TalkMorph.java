package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class TalkMorph extends Polymorph {

	public TalkMorph(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	@Override
	public void update() {
		
	}

}
