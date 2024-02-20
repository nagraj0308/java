import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

class program48a extends JFrame{
	private JLabel item1;
	private JLabel item2;
	
	program48a(){
	super("The title bar");
	setLayout(new FlowLayout());
	item1=new JLabel("this is a sentencew");
	item1.setToolTipText("This is gona show up on hover");
	add(item1);
	}
}

class program48{
	public static void main(String args[]){
	program48a o1=new program48a();
	o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	o1.setSize(100,200);
	o1.setVisible(true);
	
	}
}
	

	
