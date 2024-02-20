import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class program59a extends JFrame{
	private String details;
	private JLabel statusbar;

	program59a(){
		super("title");
		statusbar = new JLabel("this is default");
		add(statusbar,BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
		}
	private class Mouseclass extends MouseAdapter{
		public void mouseClicked(MouseEvent me){
			details=String.format("You clicked %d",me.getClickCount());
			if(me.isMetaDown())
				details+="with right mouse button";
			else if(me.isAltDown())
				details+="with center mouse button";
			else 	
				details+="with left mouse button";
			statusbar.setText(details);
		}
	}

}
class program59{
	
	public static void main(String args[]){
	program59a o1=new program59a();
	o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	o1.setSize(350,100);
	o1.setVisible(true);
	}
}