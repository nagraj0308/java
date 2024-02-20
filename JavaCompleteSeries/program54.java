import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class program54a extends JFrame{
	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;

	program54a(){
	super("The Title");
	setLayout(new FlowLayout());
	
	tf=new JTextField("This is a sentence",20); add(tf);
	
	pb=new JRadioButton("plain",true); add(pb);
	bb=new JRadioButton("bold",true); add(bb);
	ib=new JRadioButton("italic",true); add(ib);
	bib=new JRadioButton("bold and italic",true); add(bib);
	
	group=new ButtonGroup();
	group.add(pb); group.add(bb); group.add(ib); group.add(bib);
	
	pf=new Font("Serif",Font.PLAIN,14);
	bf=new Font("Serif",Font.BOLD,14);
	itf=new Font("Serif",Font.ITALIC,14);
	bif=new Font("Serif",Font.BOLD+Font.ITALIC,14);

	pb.addItemListener(new program54aa(pf));
	bb.addItemListener(new program54aa(bf));
	ib.addItemListener(new program54aa(itf));
	bib.addItemListener(new program54aa(bif));

	tf.setFont(pf);
	}
	private class program54aa implements ItemListener{
		private Font font;
		private program54aa(Font f){
			font=f;
			}
		public void itemStateChanged( ItemEvent ie){
			tf.setFont(font);
			}

	}

}
public class program54{
	public static void main(String args[]){
	program54a o1=new program54a();
	o1.setSize(500,300);
	o1.setVisible(true);
	o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}