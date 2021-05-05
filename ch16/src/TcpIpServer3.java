import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class TcpIpServer3 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime()+"서버가 준비되었습니다.");
			
			serverSocket.setSoTimeout(5*1000);
			Socket socket = serverSocket.accept();
			System.out.println(getTime()
					+socket.getInetAddress()+"로부터 연결요청이 들어왔습니다.");
			
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			dos.writeUTF("[Notice] Hello! I'm from Server.");
			System.out.println(getTime()+"데이터를 전송했습니다.");
			
			System.out.println(dis.readUTF());
			
			
		} catch (SocketTimeoutException se) {
			System.out.println("지정된 시간동안 접속요청이 없어서 서버를 종료합니다,");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // main
	
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}

}
