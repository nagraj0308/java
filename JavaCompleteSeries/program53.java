import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class program53a extends JFrame implements ItemListener{
	private JTextField tf;
	private JCheckBox bb;
	private JCheckBox ib;

	program53a(){
	super("The Title");
	setLayout(new FlowLayout());
	
	tf=new JTextField("This is a sentence",20); tf.setFont(new Font("Serif",Font.PLAIN,14)); add(tf);
	bb=new JCheckBox("Bold"); add(bb);
	ib=new JCheckBox("Italic"); add(ib);

	
	bb.addItemListener(this);
	ib.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ae){
		 Font font=null;
		 if(bb.isSelected() && ib.isSelected()){
			font=new Font("Serif",Font.BOLD + Font.ITALIC,14);

		}
		else if(bb.isSelected()){
			font=new Font("Serif",Font.BOLD,14);

		}
		else if(ib.isSelected()){
			font=new Font("Serif",Font.ITALIC,14);

		}
		else 
		
			font=new Font("Serif",Font.PLAIN,14);
		tf.setFont(font);

	}

}
public class program53{
	public static void main(String args[]){
	program53a o1=new program53a();
	o1.setSize(500,300);
	o1.setVisible(true);
	o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}