import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class program52a extends JFrame implements ActionListener{
	private JButton reg;
	private JButton custom;

	program52a(){
	super("The Title");
	setLayout(new FlowLayout());
	
	reg=new JButton("Click For Registration"); add(reg);
	
	Icon img1=new ImageIcon(getClass().getResource("program52a1.png"));
	Icon img2=new ImageIcon(getClass().getResource("program52a2.png"));
	custom=new JButton("Custom",img1); 
	custom.setRolloverIcon(img2); add(custom);
	reg.addActionListener(this);
	custom.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		 if(ae.getSource()==reg){
			JOptionPane.showMessageDialog(null,String.format("%s",ae.getActionCommand()));
		 }
		 if(ae.getSource()==custom){
		
		}

	}

}
public class program52{
	public static void main(String args[]){
	program52a o1=new program52a();
	o1.setSize(500,300);
	o1.setVisible(true);
	o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}