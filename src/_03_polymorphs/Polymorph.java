package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    
    Polymorph(int x, int y, int w, int h){
   	 this.x = x;
   	 this.y = y;
   	 this.width = w;
   	 this.height = h;
    }
    
    public int getX() {
    	return x;
    }
    
    public void setX(int i) {
    	x = i;
    }
    
    public int getY() {
    	return y;
    }
    
    public void setY(int i) {
    	y = i;
    }
    
    public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
