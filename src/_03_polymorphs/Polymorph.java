package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	public static int xGetter() {
		return x;
	}
	public static int yGetter() {
		return y;
	}
	public static void xSetter(int xx) {
		x=xx;
	}
	public static void ySetter(int yy) {
		y=yy;
	}
	private static int x;
    private static int y;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
