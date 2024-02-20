import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
@SuppressWarnings("unchecked")
class program55a extends JFrame{
	private JComboBox box;
	private JLabel picture;
	@SuppressWarnings("unchecked")
	private static String[] filename={"program55a1.png","program55a2.png" }; 
	private Icon[] pics={new ImageIcon(getClass().getResource(filename[0])),new ImageIcon(getClass().getResource(filename[1]) ) }; 	

	program55a(){
		super("the title");
		setLayout(new FlowLayout());

		box =new JComboBox(filename);
		box.addItemListener(
			new ItemListener() {
				public void itemStateChanged(ItemEvent ie) {
					if(ie.getStateChange()==ItemEvent.SELECTED)
						picture.setIcon(pics[box.getSelectedIndex()]);
						}   // itemstatechanged		
			} );		

		
		add(box);
		picture=new JLabel(pics[0]); add(picture);
	}
}

class program55{
	public static void main(String args[]){
		program55a o1=new program55a();
		o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		o1.setSize(300,200);
		o1.setVisible(true);
		}
	}