//TCP is a connection based protocol....
//UDP is a connection-less protocol so ever packet of data should know that where will it have to go...
import java.net.*;
public class prog23UDPClient{
	public static void main(String args[])throws Exception{
		DatagramSocket ds=new DatagramSocket();
		int i=8;
		byte b[]=(i+"").getBytes();
		InetAddress ia=InetAddress.getByName("127.0.0.1");  
		DatagramPacket dp=new DatagramPacket(b,b.length,ia,5555);
		ds.send(dp);

		byte b1[]=new byte[1024];
		DatagramPacket dp1=new DatagramPacket(b1,b1.length);
		ds.receive(dp1);
		String str=new String(dp1.getData());
		System.out.println("Result="+str);
	
	}
	
}
