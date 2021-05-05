import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class WordStudy extends Frame{
	Button first = new Button("<<");
	Button prev  = new Button("<");
	Button next  = new Button(">");
	Button last  = new Button(">>");
	Panel buttons = new Panel();
	TextArea ta = new TextArea();
	ArrayList<String> wordList = new ArrayList<>();
	
	final String WORD_FILE = "word_data.txt";
	final String CR_LF = System.getProperty("line.separator");
	
	int pos =0;
	
	WordStudy(String title) {
		super(title);
		
		buttons.add(first);
		buttons.add(prev);
		buttons.add(next);
		buttons.add(last);
		add("South", buttons);
		add("Center", ta);
		
		EventHandler handler = new EventHandler();
		addWindowListener(handler);
		first.addActionListener(handler);
		prev.addActionListener(handler);
		next.addActionListener(handler);
		last.addActionListener(handler);
		
		loadFile(WORD_FILE);
		
		setBackground(Color.YELLOW);
		setSize(300, 200);
		setLocation(200, 200);
		setResizable(true);
		setVisible(true);
		
		showFirst();
		
		
	} // WordStudy()
	
	void showFirst() {
		pos =0;
		display(pos);
	}
	
	void showPrevious() {
		pos = (pos>0) ? --pos : 0;
		display(pos);
	}
	
	void showNext() {
		int size = wordList.size();
		pos = (pos < size-1) ? ++pos : size-1;
		display(pos);
	}
	
	void showLast() {
		pos = wordList.size()-1;
		display(pos);
	}
	
	
	
	
	void display(int pos) {
		
		String tmp = wordList.get(pos);
		StringBuffer sb = new StringBuffer(tmp.length());
		
		
		StringTokenizer st = new StringTokenizer(tmp, "|");
		
		while(st.hasMoreTokens())
			sb.append(st.nextToken()).append(CR_LF);
		
		ta.setText(sb.toString());
	}
	
	void loadFile(String fileName) {
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader in = new BufferedReader(fr);
			
			String line = "";
			
			while((line=in.readLine())!=null) {
				wordList.add(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			System.exit(1);
			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		WordStudy mainWin = new WordStudy("Word Study");
	}// main()
	
	class EventHandler extends WindowAdapter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent ae) {
			Button b = (Button)ae.getSource();
			ta.setText(null);
			
			if(b==first) {
				showFirst();
			} else if(b==prev) {
				showPrevious();
			} else if(b==next) {
				showNext();
			} else if(b==last) {
				showLast();
			}
		}
		
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
	} // class EventHandler

}
