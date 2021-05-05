import java.io.*;
public class HexaViewer {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			File f = new File(args[0]);
			
			int data =0;
			
			for(int i=0; i<32; i++) {
				for(int j=0; j<16; j++) {
					if((data = bis.read())!=-1) {
						System.out.printf("%02X ", data);
					}
				}
				System.out.println();
			}
			bis.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		
	}

}
