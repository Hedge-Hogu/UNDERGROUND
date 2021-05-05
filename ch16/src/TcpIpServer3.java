import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class TcpIpServer3 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime()+"������ �غ�Ǿ����ϴ�.");
			
			serverSocket.setSoTimeout(5*1000);
			Socket socket = serverSocket.accept();
			System.out.println(getTime()
					+socket.getInetAddress()+"�κ��� �����û�� ���Խ��ϴ�.");
			
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			dos.writeUTF("[Notice] Hello! I'm from Server.");
			System.out.println(getTime()+"�����͸� �����߽��ϴ�.");
			
			System.out.println(dis.readUTF());
			
			
		} catch (SocketTimeoutException se) {
			System.out.println("������ �ð����� ���ӿ�û�� ��� ������ �����մϴ�,");
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
