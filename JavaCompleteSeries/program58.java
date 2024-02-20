import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class program58a extends JFrame{
	private JPanel mousepanel;
	private JLabel statusbar;
	program58a(){
		super("title");
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel,BorderLayout.CENTER);

		statusbar=new JLabel("default");
		add(statusbar,BorderLayout.SOUTH);

		Handlerclass handler=new Handlerclass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
	}
	private class Handlerclass implements MouseListener,MouseMotionListener{
		public void mouseClicked(MouseEvent me)	{
		statusbar.setText(String.format("Clicked at %d,%d",me.getX(),me.getY()));
		}
	public void mousePressed(MouseEvent me){
		statusbar.setText("you pressed the mouse");
		}
	public void mouseReleased(MouseEvent me){
		statusbar.setText("you released the mouse");
		}
	public void mouseEntered(MouseEvent me){
		statusbar.setText("you Entered the mouse");
		mousepanel.setBackground(Color.RED);
		}
	public void mouseExited(MouseEvent me){
		statusbar.setText("you left the window");
		mousepanel.setBackground(Color.YELLOW);
		}
	public void mouseDragged(MouseEvent me){
		statusbar.setText("you dragging the mouse");
		}
	public void mouseMoved(MouseEvent me){
		statusbar.setText("you Moved the mouse");
		}
	}
}
class program58{
	public static void main(String args[]){
		program58a o1=new program58a();
		o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		o1.setSize(300,200);
		o1.setVisible(true);
	}
}