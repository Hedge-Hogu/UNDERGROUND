import java.io.*;

public class BufferedOutputStreamEx1 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			// new byte[5];
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			//���� 123.txt�� 1���� 9���� ���
			for(int i='1'; i<='9'; i++) {
				bos.write(i);
			}
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
