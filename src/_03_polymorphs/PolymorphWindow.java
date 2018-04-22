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

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
   
    
    private JFrame window;
    private Timer timer;
    ArrayList<Polymorph> s;
    
    public static void main(String[] args) {
    	ArrayList<Polymorph> s = new ArrayList<Polymorph>();
       	Polymorph b=new BluePolymorph(50, 50);
       	s.add(b);
       	Polymorph r=new RedMorph(100, 100);
        s.add(r);
        Polymorph m=new MovingMorph(150,150);
        s.add(m);
   	 new PolymorphWindow().buildWindow();
   	 
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    @SuppressWarnings("static-access")
	public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for(int i=0;i<s.size();i++) {
   		 System.out.println(s.get(i).xGetter());
   		 s.get(i).draw(g);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	for(int i=0;i<s.size();i++) {
  		 s.get(i).update();
  	 }
    }
}
