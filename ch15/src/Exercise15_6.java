import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Exercise15_6 {
	static String[] argArr; // �Է¹��� �Ű������� ��� ���� �迭
	static File curDir; // ���� ���丮
	
	static {
		try {
			curDir = new File(System.getProperty("user.dir"));
		} catch (Exception e) {}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // ��� inputStream
		
		while(true) {
			try {
				String prompt = curDir.getCanonicalPath()+">>";
				System.out.print(prompt);
				
				// ȭ�����κ��� ���δ����� �Է¹޴´�.
				String input = s.nextLine();
				
				input = input.trim(); // �Է¹��� ������ �յ� ���� ����
				argArr = input.split(" +");
				
				String command = argArr[0].trim();
				
				if("".equals(command)) continue;
				
				command = command.toLowerCase(); // �ҹ��ڷ� ��ȯ
				
				if(command.equals("q")) {
					System.exit(0);
				} else if(command.equals("cd")) {
					cd();
				} else {
					for(int i=0; i<argArr.length; i++) {
						System.out.println(argArr[i]);
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("�Է¿����Դϴ�.");
			}
		} // while
	}// main()
	
	public static void cd() {
		if(argArr.length==1) {
			System.out.println(curDir);
			return;
		} else if(argArr.length>2) {
			System.out.println("USAGE : cd directory");
			return;
		}
		
		String subDir = argArr[1];
		
		if(subDir.equals("..")) {
			
			File newDir = curDir.getParentFile(); // �θ� ���丮
			
			if(newDir==null) {
				System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			} else {
				curDir = newDir;
			}
			
		} else if(subDir.equals(".")) {
			System.out.println(curDir);
			
		} else {
			
			File newDir = new File(curDir, subDir); // subDir�� ������� �� curDir�� ���� ���丮 ����
			
			if(newDir.exists() && newDir.isDirectory()) {
				curDir = newDir;
			} else {
				System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			}
		}
	}

}

