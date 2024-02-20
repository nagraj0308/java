import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class program64a extends JFrame{
	private JButton lb;
	private JButton cb;
	private JButton rb;
	private FlowLayout layout;
	private Container container;
	
	program64a(){
		super("the title");
		layout = new FlowLayout();
		container=getContentPane();
		setLayout(layout);

		lb=new JButton("left");
		add(lb);
		lb.addActionListener(new ActionListener(){  public void actionPerformed(ActionEvent  ae){ layout.setAlignment(FlowLayout.LEFT);}});
		layout.layoutContainer(container);
		
		cb=new JButton("center");
		add(cb);
		cb.addActionListener(new ActionListener(){  public void actionPerformed(ActionEvent  ae){ layout.setAlignment(FlowLayout.CENTER);}});
		layout.layoutContainer(container);
		
		rb=new JButton("right");
		add(rb);
		rb.addActionListener(new ActionListener(){  public void actionPerformed(ActionEvent  ae){ layout.setAlignment(FlowLayout.RIGHT);}});
		layout.layoutContainer(container);
			

	}
}

class program64{
 public static void main(String args[]){
	program64a o1=new program64a();
		o1.setVisible(true);
		o1.setSize(300,100);
		o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}