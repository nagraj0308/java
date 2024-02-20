import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
@SuppressWarnings("unchecked")
@Deprecated
class program57a extends JFrame{
	private JList leftlist;
	private JList rightlist;
	private JButton movebutton;
	private static String[] foods={"bacon","wings","ham","beef","more"};
	@SuppressWarnings("unchecked")
	@Deprecated
	program57a(){
			super("title");
		
		
		setLayout(new FlowLayout());
		leftlist = new JList(foods);
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));
		movebutton=new JButton("More-->");
		movebutton.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){rightlist.setListData(leftlist.getSelectedValues());}});
		add(movebutton);
		
		rightlist=new JList();
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellHeight(15);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));
	
		}
}
@Deprecated class program57{
	
	public static void main(String args[]){
	program57a o1=new program57a();
	o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	o1.setSize(350,100);
	o1.setVisible(true);
	}
}		