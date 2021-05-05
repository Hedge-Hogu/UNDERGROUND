import java.awt.*;
import java.io.*;
import java.net.*;
import java.awt.event.*;

public class ChatClient extends Frame {
	String nickname ="";
	String serverIp = "";
	int serverPort =0;
	
	DataOutputStream out;
	DataInputStream in;
	
	Panel p = new Panel();
	TextArea ta = new TextArea();
	TextField tf = new TextField();
	
	ChatClient(String nickname, String serverIp, String serverPort) {
		super("Chatting with "+serverIp+":"+serverPort);
		this.nickname = nickname;
		this.serverIp = serverIp;
		this.serverPort = Integer.parseInt(serverPort);
		
		setBounds(600, 200, 300, 200);
		
		p.setLayout(new BorderLayout());
		p.add(tf, "Center");
		
		add(ta, "Center");
		add(p, "South");
		
		addWindowListener(new WindowAdapter() {
		    public void windowClosing(WindowEvent e) {
		    	System.exit(0);
		    }
		});
		EventHandler handler = new EventHandler();
		ta.addFocusListener(handler);
		tf.addFocusListener(handler);
		tf.addActionListener(handler);
		
		ta.setEditable(false);
		
		setVisible(true);
		tf.requestFocus();
	}
	
	void startClient() {
		try {
			Socket socket = new Socket(serverIp, serverPort);
			ta.setText("상대방과 연결되었습니다.");
			
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
			
			String msg ="";
			while(in!=null) {
				try {
					msg = in.readUTF();
					ta.append("\r\n" + msg);
				} catch (IOException e) {
				}
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // startClient()

	public static void main(String[] args) {
		if(args.length!=3) {
			System.out.println("USAGE : java ChatClient "
					+ "NICKNAME SERVER_IP SERVER_PORT");
			System.exit(0);
		}
		
//		ChatClient chatWin = new ChatClient("흑우", "127.0.0.1", "7777");
		ChatClient chatWin = new ChatClient(args[0], args[1], args[2]);
		chatWin.startClient();
	} // main
	
	class EventHandler extends FocusAdapter implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent ae) {
			String msg = tf.getText();
			
			if("".equals(msg)) return;
			
			if(out!=null) {
				try {
					out.writeUTF(nickname+">"+msg);
				} catch (IOException e) {}
			}
			
			
			
			ta.append("\r\n"+nickname+">"+msg);
			tf.setText("");
		}
		
	    public void focusGained(FocusEvent e) {
	    	tf.requestFocus();
	    }
	} // class EventHandler
} // class
