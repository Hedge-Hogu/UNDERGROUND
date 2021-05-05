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
				System.out.println(f.getName()+" ������ �����Ǿ����ϴ�.");
			} else {
				System.out.println("���� ������ ���� �Ͽ����ϴ�.");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
