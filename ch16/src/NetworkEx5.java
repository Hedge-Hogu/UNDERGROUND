import java.net.*;
import java.io.*;

public class NetworkEx5 {
	public static void main(String[] args) {
		URL url = null;
		InputStream src = null;
		FileOutputStream fos = null;
		String address 
		= "https://github.com/castello/javajungsuk3/raw/master/java_jungsuk3e_src_20170601.zip";
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		int ch =0;
		
		try {
			url = new URL(address);
			src = url.openStream();
			String filename = url.getFile();
			
			in = new BufferedInputStream(src);
			fos = new FileOutputStream(filename.substring(filename.lastIndexOf('/')+1));
			out = new BufferedOutputStream(fos);
			
			System.out.println(url.getFile()+" 파일을 다운로드 합니다.");
			while((ch = in.read())!=-1) {
				out.write(ch);
			}
			in.close();
			out.close();
			System.out.println(url.getFile()+" 파일 다운로드를 완료하였습니다.");
			
		} catch (MalformedURLException e) {
			System.out.println("MalformedURLException!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
