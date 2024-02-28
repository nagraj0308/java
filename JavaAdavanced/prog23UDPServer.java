import java.net.*;
public class prog23UDPServer{
	public static void main(String args[])throws Exception {
		DatagramSocket ds=new DatagramSocket(5555);
		byte b1[]=new byte[1024];
		DatagramPacket dp1=new DatagramPacket(b1,b1.length);
		ds.receive(dp1);
		String str=new String(dp1.getData());

		int num=Integer.parseInt(str.trim());
		byte b2[]=((num*num)+"").getBytes();
		InetAddress ia=InetAddress.getByName("192.168.15.92");  
		DatagramPacket dp2=new DatagramPacket(b2,b2.length,ia,dp1.getPort());
		ds.send(dp2);
		}
}