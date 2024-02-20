import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

class program49a extends JFrame{
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField pf;
	
	program49a(){
		super("The Title");
		setLayout(new FlowLayout());

		item1=new JTextField(10);
		add(item1);

		item2=new JTextField("Enter text Here");
		add(item2);

		item3=new JTextField("uneditable",20);
		item3.setEditable(false);
		add(item3);
		
		pf=new JPasswordField("mypass");
		add(pf);
		
		program49aa kk=new program49aa();
		item1.addActionListener(kk);
		item2.addActionListener(kk);
		item3.addActionListener(kk);
		pf.addActionListener(kk);

	}

	private class program49aa implements ActionListener{
		public void actionPerformed(ActionEvent x){
			String st="";
			if(x.getSource()==item1)
				st=String.format("field 1:%s",x.getActionCommand());
			if(x.getSource()==item2)
				st=String.format("field 2:%s",x.getActionCommand());
			if(x.getSource()==item3)
				st=String.format("field 3:%s",x.getActionCommand());
			if(x.getSource()==pf)
				st=String.format("password:%s",x.getActionCommand());
			JOptionPane.showMessageDialog(null,st);
				}
			}
}





class program49{
	public static void main(String args[]){
	program49a o1=new program49a();
	o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	o1.setSize(350,100);
	o1.setVisible(true);
	}
}
