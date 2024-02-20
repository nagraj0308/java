import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class program67a extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.ORANGE);
		
		g.setColor(Color.BLUE);
		g.drawLine(10,25,200,45);

		g.setColor(Color.RED);
		g.drawRect(10,55,100,30);

		g.setColor(Color.GREEN);
		g.fillOval(10,95,100,30);
		
		g.setColor(Color.YELLOW);
		g.fill3DRect(10,160,100,30,true);
		
	}

}

class program67 {
	public static void main(String args[]){
		program67a o1=new program67a();
		JFrame f=new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(o1);
		f.setSize(400,250);
		f.setVisible(true);
	}


}

