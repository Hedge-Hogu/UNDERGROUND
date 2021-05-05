import java.io.*;

public class HexaViewer1 {
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("USAGE : java HexaViewer FILENAME");
			System.exit(0);
		}
		
		String inputFile = args[0];
		
		try {
			FileInputStream input = new FileInputStream(inputFile);
//			PrintStream output = new PrintStream(System.out);
			
			int data =0;
			int i=0;
			
			while((data = input.read())!=-1) {
				System.out.printf("%02X ", data);
//				output.printf("%02X ", data);
				if(++i%16==0)
					System.out.println();
//					output.println();
			}
			
			input.close();
//			output.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
