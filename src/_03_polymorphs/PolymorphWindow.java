package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    ArrayList<Polymorph> morph;
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME! <Credit to XKCD.COM for comic>");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 morph = new ArrayList<>();
   	 morph.add(new RedPolymorph(10, 100, 40, 40)); // RED
   	 morph.add(new BluePolymorph(80, 100, 20, 20)); // BLUE
   	 morph.add(new MovingMorph(200, 220, 100, 100)); // GREEN
   	 morph.add(new CircleMorph(300, 220, 50, 50)); // YELLOW
   	 morph.add(new MouseMorph(400, 0, 50, 50)); // CYAN
   	 morph.add(new ImageMorph(200, 100, 100, 100)); // XKCD.COM/953
   	 morph.add(new ClickMorph(300, 200, 50, 50)); // BLACK
   	 this.addMouseListener((ClickMorph) morph.get(6));
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for (Polymorph p : morph) {
  		 p.draw(g);
  	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 for (Polymorph p : morph) {
   		 p.update();
   	 }
    }
}
