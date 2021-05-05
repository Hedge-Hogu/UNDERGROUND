import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Exercise15_6 {
	static String[] argArr; // 입력받은 매개변수를 담기 위한 배열
	static File curDir; // 현재 디렉토리
	
	static {
		try {
			curDir = new File(System.getProperty("user.dir"));
		} catch (Exception e) {}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // 기반 inputStream
		
		while(true) {
			try {
				String prompt = curDir.getCanonicalPath()+">>";
				System.out.print(prompt);
				
				// 화면으로부터 라인단위로 입력받는다.
				String input = s.nextLine();
				
				input = input.trim(); // 입력받은 값에서 앞뒤 공백 제거
				argArr = input.split(" +");
				
				String command = argArr[0].trim();
				
				if("".equals(command)) continue;
				
				command = command.toLowerCase(); // 소문자로 변환
				
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
				System.out.println("입력오류입니다.");
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
			
			File newDir = curDir.getParentFile(); // 부모 디렉토리
			
			if(newDir==null) {
				System.out.println("유효하지 않은 디렉토리입니다.");
			} else {
				curDir = newDir;
			}
			
		} else if(subDir.equals(".")) {
			System.out.println(curDir);
			
		} else {
			
			File newDir = new File(curDir, subDir); // subDir을 기반으로 한 curDir의 하위 디렉토리 생성
			
			if(newDir.exists() && newDir.isDirectory()) {
				curDir = newDir;
			} else {
				System.out.println("유효하지 않은 디렉토리입니다.");
			}
		}
	}

}

