package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{
	int a=0;
	int b=0;
	MovingMorph(int x, int y) {
		super(x, y);
	}
	int x=xGetter();
	int y=yGetter();

	@Override
	public void draw(Graphics g) {
		a++;
		b++;
		g.fillRect(x+b, y+a, 50, 50);
	}
	
}
