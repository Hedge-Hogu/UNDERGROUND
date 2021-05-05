import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UdpServer {
	public void start() throws IOException {
		// ���Ͽ� ��Ʈ�� ���ε�
		DatagramSocket socket = new DatagramSocket(7777);
		DatagramPacket inPacket, outPacket;
		
		byte[] inMsg = new byte[10];
		byte[] outMsg;
		
		while(true) {
			// �ޱ� ���� ��Ŷ ����
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			
			// ��Ŷ�� ����
			socket.receive(inPacket);
			
			// ���� ��Ŷ�� �ּҿ� ��Ʈ�� ����
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			
			// ���� �ð��� ���� �غ�
			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			String time = sdf.format(new Date());
			outMsg = time.getBytes();
			
			// ��Ŷ�� �����ؼ� Ŭ���̾�Ʈ�� ����
			outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
			socket.send(outPacket);
		}
	} // start()

	public static void main(String[] args) {
		try {
			new UdpServer().start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // main
} // class
