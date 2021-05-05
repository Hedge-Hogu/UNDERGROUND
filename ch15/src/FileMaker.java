import java.io.*;
public class FileMaker {
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("USAGE: java FileMaker FileName");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		createNewFile(f);
	}
	
	public static void createNewFile(File f) {
		try {
			if(f.createNewFile()) {
				System.out.println(f.getName()+" 파일이 생성되었습니다.");
			} else {
				System.out.println("파일 생성에 실패 하였습니다.");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
