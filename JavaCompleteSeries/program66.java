import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class program66a extends JFrame{
	private JButton b;
	private Color color=(Color.WHITE);
	private JPanel panel;

	program66a(){
		super("the title");
		panel = new JPanel();
		panel.setBackground(color);
		
		b=new JButton("Choose a color");
		b.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent ae){ 
					color=JColorChooser.showDialog(null,"Pick your color",color);
					if(color==null)
						color=(Color.WHITE);
					}});
		add(panel,BorderLayout.CENTER);
		add(b,BorderLayout.SOUTH);
		setSize(425,150);
		setVisible(true);
	}
}

class program66 {
	public static void main(String args[]){
		program66a o1=new program66a();
		o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}


}
