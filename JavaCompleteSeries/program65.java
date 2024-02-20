import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class program65a extends JPanel{

	public void paintComponent(Graphics g) {
       
	g.setColor(Color.BLUE);
	g.fillRect(25,25,100,30);	//fillRect(x,y,width,height)
	g.setColor(new Color(190,81,215));
	g.fillRect(25,65,100,30);
	g.drawString("this is some text",25,120);

	}
}


class program65 {
	public static void main(String args[]){
		JFrame f=new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		program65a o1=new program65a();
		f.add(o1);
		f.setSize(400,250);
		f.setVisible(true);
	}


}


 
