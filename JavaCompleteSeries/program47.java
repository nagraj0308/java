import javax.swing.JOptionPane;

class program47{
	public static void main(String args[]){
		String fn= JOptionPane.showInputDialog("Enter first Number");
		String sn= JOptionPane.showInputDialog("Enter Second Number");
		
		int num1=Integer.parseInt(fn);
		int num2=Integer.parseInt(sn);
		JOptionPane.showMessageDialog(null,"sum="+(num1+num2),"The Title",JOptionPane.PLAIN_MESSAGE); // showmessageDialog(position,message,title,popup)
		}
	}