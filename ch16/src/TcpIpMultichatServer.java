import java.io.*;
import java.util.*;
import java.net.*;

public class TcpIpMultichatServer {
	HashMap clients;
	
	TcpIpMultichatServer() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);
	}
	
	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("������ ���۵Ǿ����ϴ�.");
			
			while(true) {
				socket = serverSocket.accept();
				System.out.println("["+socket.getInetAddress()
					+":"+socket.getPort()+"���� �����Ͽ����ϴ�.");
				// ServerReceiver
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // start()
	
	void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator();
		
		while(it.hasNext()) {
			try {
				DataOutputStream out = (DataOutputStream)clients.get(it.next());
				out.writeUTF(msg);
			} catch (IOException e) {}
		}
	} // sendToAll()
	
	public static void main(String[] args) {
		new TcpIpMultichatServer().start();
	} // main
	
	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {}
		}

		@Override
		public void run() {
			String name ="";
			
			try {
				name = in.readUTF();
				// sendToAll
				sendToAll("#"+name+"���� �����̽��ϴ�.");
				
				clients.put(name, out);
				System.out.println("���� ���������� ���� "+clients.size()+"�Դϴ�.");
				while(in!=null) {
					sendToAll(in.readUTF());
				}
			} catch (IOException e) {
				
			} finally {
				sendToAll("#"+name+"���� �����̽��ϴ�.");
				clients.remove(name);
				System.out.println("["+socket.getInetAddress()
					+":"+socket.getPort()+"���� ������ �����Ͽ����ϴ�.");
				System.out.println("���� ���������� ���� "+clients.size()+"�Դϴ�.");
			}
		} // run
	} // class ServerReceiver
} // class
