import java.io.*;

public class FileEx1 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\java\\workspace\\ch15\\src", "NewFile.java");
		System.out.println(f.createNewFile());
		
		
	}

}
