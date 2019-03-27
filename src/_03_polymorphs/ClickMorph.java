package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class ClickMorph extends Polymorph implements MouseListener {

	public ClickMorph(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	@Override
	public void update() {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		JOptionPane.showMessageDialog(null, "Color key:\nRedPolymorph - RED\nBluePolymorph - BLUE\n"
				+ "MovingMorph - GREEN\nCircleMorph - YELLOW\nMouseMorph - CYAN\nImageMorph - xkcd.com/953\n"
				+ "ClickMorph - BLACK");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}
