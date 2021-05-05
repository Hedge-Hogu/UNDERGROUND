import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Exercise15_9 extends Frame {
	String fileName;
	TextArea content;
	MenuBar mb;
	Menu mFile;
	MenuItem miNew, miOpen, miSaveAs, miExit;

	Exercise15_9(String title) {
		super(title);
		content = new TextArea();
		add(content);
		
		mb = new MenuBar();
		mFile = new Menu("File");
		
		miNew = new MenuItem("New");
		miOpen = new MenuItem("Open");
		miSaveAs = new MenuItem("Save As...");
		miExit = new MenuItem("Exit");
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSaveAs);
		mFile.addSeparator();
		mFile.add(miExit);
		
		mb.add(mFile);
		setMenuBar(mb);
		
		MyHandler handler = new MyHandler();
		miNew.addActionListener(handler);
		miOpen.addActionListener(handler);
		miSaveAs.addActionListener(handler);
		miExit.addActionListener(handler);
		
		setSize(300, 200);
		setVisible(true);
	}
	//���õ� ������ ������ TextArea�� �����ش�.
	void fileOpen(String fileName) {
		BufferedReader br = null;
		FileReader fr = null;
		try {
		fr = new FileReader(fileName);
		br = new BufferedReader(fr);
		
		String line ="";
		
		while((line = br.readLine())!=null) {
			content.append(line+"\n");
		}
		
		
		
//		try {
//			fr = new FileReader(fileName);
//			br = new BufferedReader(fr);
			
//			StringWriter out = new StringWriter();
//			
//			int line = 0;
//			
//			while((line = fr.read())!=-1) {
//				out.write(line);
//				out.write('\n');
//			}
//			content.setText(out.toString());
			
		} catch (FileNotFoundException e) {
			System.out.println("������ ���� ���� �ʽ��ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) 
					br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	// ���� TextArea�� ������ ���õ� ���Ͽ� �����Ѵ�.
	void saveAs(String fileName) {
		BufferedWriter bw = null;
		
		try {
			FileWriter fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			
			bw.write(content.getText());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			try {
				if(bw!=null)
					bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		Exercise15_9 mainWin = new Exercise15_9("Text Editor");
	} // main
	
	class MyHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			
			if(command.equals("New")) {
				content.setText("");
			} else if(command.equals("Open")) {
				FileDialog fileOpen 
					= new FileDialog(Exercise15_9.this, "���Ͽ���");
				fileOpen.setVisible(true);
				fileName = fileOpen.getDirectory()+fileOpen.getFile();
				System.out.println(fileName);
				//���õ� ������ ������ TextArea�� �����ش�.
				fileOpen(fileName);
			} else if(command.equals("Save As...")) {
				FileDialog fileSave 
				= new FileDialog
					(Exercise15_9.this, "��������", FileDialog.SAVE);
				fileSave.setVisible(true);
				fileName = fileSave.getDirectory()+fileSave.getFile();
				System.out.println(fileName);
				// ���� TextArea�� ������ ���õ� ���Ͽ� �����Ѵ�.
				saveAs(fileName);
			} else if(command.equals("Exit")) {
				System.exit(0);
			}
		}
		
	}

}
