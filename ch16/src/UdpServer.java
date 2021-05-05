import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UdpServer {
	public void start() throws IOException {
		// 소켓에 포트를 바인딩
		DatagramSocket socket = new DatagramSocket(7777);
		DatagramPacket inPacket, outPacket;
		
		byte[] inMsg = new byte[10];
		byte[] outMsg;
		
		while(true) {
			// 받기 위한 패킷 생성
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			
			// 패킷을 받음
			socket.receive(inPacket);
			
			// 받은 패킷의 주소와 포트를 저장
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			
			// 서버 시간을 보낼 준비
			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			String time = sdf.format(new Date());
			outMsg = time.getBytes();
			
			// 패킷을 생성해서 클라이언트에 전송
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
