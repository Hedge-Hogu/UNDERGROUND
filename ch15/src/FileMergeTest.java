import java.io.*;
import java.util.*;

public class FileMergeTest {
	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("USAGE: java FileMergeTest MERGE_FILENAME "
					+ "FileNAME1 FILENAME2 ...");
			System.exit(0);
		}
		
		try {
			FileWriter fw = new FileWriter(args[0]);
			BufferedWriter out = new BufferedWriter(fw);
			
			FileReader fr = null;
			BufferedReader in = null;
			
			String line ="";
			
			for(int i=1; i<args.length; i++) {
				File f = new File(args[i]);
				if(f.exists()) {
					in = new BufferedReader(new FileReader(args[i]));
				} else {
					System.out.println(args[i]+" - 존재하지 않는 파일입니다.");
					System.exit(0);
				}
				while((line = in.readLine())!=null) {
					out.write(line);
				}
				System.out.println();
				in.close();
			}
			out.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
