import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class ChatWin extends Frame{
	String nickname = "";
	TextArea ta = new TextArea();
	Panel p = new Panel();
	TextField tf = new TextField(30);
	Button bSave = new Button("저장");

	public ChatWin(String nickname) {
		super("Chatting");
		this.nickname = nickname;
		
		setBounds(200, 100, 300, 200);
		
		p.setLayout(new FlowLayout());
		p.add(tf);
		p.add(bSave);
		
		add(ta, "Center");
		add(p, "South");
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		bSave.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent ae) {
		    	FileDialog fileSave 
		    		= new FileDialog(ChatWin.this, "파일저장", FileDialog.SAVE);
		    	fileSave.setVisible(true);
		    	String fileName = fileSave.getDirectory()+fileSave.getFile();
		    	saveAs(fileName);
		    }
		});
		
		EventHandler handler = new EventHandler();
		ta.addFocusListener(handler);
		tf.addFocusListener(handler);
		tf.addActionListener(handler);
		
		ta.setText("#"+nickname+"님 즐거운 채팅되세요.");
		ta.setEditable(false);
		
		setResizable(false);
		setVisible(true);
		tf.requestFocus();
	} // ChatWin()
	
	void saveAs(String fileName) {
		FileWriter fos = null;
		BufferedWriter out = null;
		
		try {
			fos = new FileWriter(fileName);
			out = new BufferedWriter(fos);
			
			out.write(ta.getText());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(out!=null)
					out.close();
			} catch (IOException e) {}
		}
		
		
	} // saveAs()
	
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("USAGE : java ChatWin NICKNAME");
			System.exit(0);
		}
		new ChatWin(args[0]);
	} // main()
	
	class EventHandler extends FocusAdapter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent ae) {
			String msg = tf.getText();
			if("".equals(msg)) return;
			
			ta.append("\r\n"+nickname+">"+msg);
			tf.setText("");
		} // actionPerformed()

		@Override
		public void focusGained(FocusEvent e) {
			tf.requestFocus();
		}
	}// class EventHandler
} // class ChatWin
